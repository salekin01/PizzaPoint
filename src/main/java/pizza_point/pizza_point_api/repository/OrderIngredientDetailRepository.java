package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.OrderIngredientDetail;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderIngredientDetailRepository extends JpaRepository<OrderIngredientDetail, Long> {

    @Query(value = "call public.sp_order_ingredient_detail_create(?1,?2,?3,?4,0)", nativeQuery = true)
    int sp_order_ingredient_detail_create(long p_order_ingredient_id, long p_supplier_goods_id,
                                          int p_quantity, BigDecimal p_total_price);

    @Query(value = "call public.sp_order_ingredient_detail_update(?1,?2,?3,?4,?5,0)", nativeQuery = true)
    int sp_order_ingredient_detail_update(long p_order_ingredient_detail_id, long p_order_ingredient_id,
                                          long p_supplier_goods_id, int p_quantity, BigDecimal p_total_price);

    @Query(value = "call public.sp_order_ingredient_detail_delete(?1,0)", nativeQuery = true)
    int sp_order_ingredient_detail_delete(long p_order_ingredient_detail_id);

    @Query(value = "select * from public.fn_order_ingredient_detail_get_all()", nativeQuery = true)
    List<OrderIngredientDetail> fn_order_ingredient_detail_get_all();

    @Query(value = "select * from public.fn_order_ingredient_detail_get_by_order_ingredient_detail_id(?1)", nativeQuery = true)
    OrderIngredientDetail fn_order_ingredient_detail_get_by_order_ingredient_detail_id(long p_order_ingredient_detail_id);

    @Query(value = "call public.sp_order_ingredient_detail_delete_by_order_ingredient_id(?1,0)", nativeQuery = true)
    int sp_order_ingredient_detail_delete_by_order_ingredient_id(long p_order_ingredient_id);
}
