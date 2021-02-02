package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.OrderIngredient;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderIngredientRepository extends JpaRepository<OrderIngredient, Long> {

    @Query(value = "call public.sp_order_ingredient_create(?1,?2,?3,0)", nativeQuery = true)
    int sp_order_ingredient_create(long p_baker_id, long p_supplier_id, LocalDateTime p_required_date);

    @Query(value = "call public.sp_order_ingredient_update(?1,?2,?3,?4,0)", nativeQuery = true)
    int sp_order_ingredient_update(long p_order_ingredient_id, long p_baker_id, long p_supplier_id, LocalDateTime p_required_date);

    @Query(value = "call public.sp_order_ingredient_delete(?1,0)", nativeQuery = true)
    int sp_order_ingredient_delete(long p_order_ingredient_id);

    @Query(value = "select * from public.fn_order_ingredient_get_all()", nativeQuery = true)
    List<OrderIngredient> fn_order_ingredient_get_all();

    @Query(value = "select * from public.fn_order_ingredient_get_by_order_ingredient_id(?1)", nativeQuery = true)
    OrderIngredient fn_order_ingredient_get_by_order_ingredient_id(long p_order_ingredient_id);
}
