package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.OrderPizza;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderPizzaRepository extends JpaRepository<OrderPizza, Long> {

    @Query(value = "call public.sp_order_pizza_create(?1,?2,?3,?4,?5,0)", nativeQuery = true)
    long sp_order_pizza_create(long p_pizza_id, int p_quantity, int p_discount,
                              BigDecimal p_total_price, String p_email);

    @Query(value = "call public.sp_order_pizza_update(?1,?2,?3,?4,?5,?6,?7,0)", nativeQuery = true)
    int sp_order_pizza_update(long p_order_pizza_id, long p_pizza_id, long p_customer_id, int p_quantity,
                              int p_discount, BigDecimal p_total_price, LocalDateTime p_required_date);

    @Query(value = "call public.sp_order_pizza_delete(?1,0)", nativeQuery = true)
    int sp_order_pizza_delete(long p_order_pizza_id);

    @Query(value = "select * from public.fn_order_pizza_get_all()", nativeQuery = true)
    List<OrderPizza> fn_order_pizza_get_all();

    @Query(value = "select * from public.fn_order_pizza_get_by_order_pizza_id(?1)", nativeQuery = true)
    OrderPizza fn_order_pizza_get_by_order_pizza_id(long p_order_pizza_id);
}
