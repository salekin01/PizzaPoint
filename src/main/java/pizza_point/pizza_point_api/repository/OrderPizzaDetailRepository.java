package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.OrderPizzaDetail;

import java.util.List;

@Repository
public interface OrderPizzaDetailRepository extends JpaRepository<OrderPizzaDetail, Long> {

    @Query(value = "call public.sp_order_pizza_detail_create(?1,?2,0)", nativeQuery = true)
    int sp_order_pizza_detail_create(long p_order_pizza_id, long p_baker_goods_id);

    @Query(value = "call public.sp_order_pizza_detail_update(?1,?2,?3,0)", nativeQuery = true)
    int sp_order_pizza_detail_update(long p_order_pizza_detail_id, long p_order_pizza_id, long p_baker_goods_id);

    @Query(value = "call public.sp_order_pizza_detail_delete(?1,0)", nativeQuery = true)
    int sp_order_pizza_detail_delete(long p_order_pizza_detail_id);

    @Query(value = "select * from public.fn_order_pizza_detail_get_all()", nativeQuery = true)
    List<OrderPizzaDetail> fn_order_pizza_detail_get_all();

    @Query(value = "select * from public.fn_order_pizza_detail_get_by_detail_id(?1)", nativeQuery = true)
    OrderPizzaDetail fn_order_pizza_detail_get_by_detail_id(long p_order_pizza_detail_id);

    @Query(value = "select * from public.fn_order_pizza_detail_get_by_order_pizza_id(?1)", nativeQuery = true)
    List<OrderPizzaDetail> fn_order_pizza_detail_get_by_order_pizza_id(long p_order_pizza_id);
}
