package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.Pizza;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    @Query(value = "call public.sp_pizza_create(?1,?2,?3,?4,0)", nativeQuery = true)
    int sp_pizza_create(String p_pizza_name, long p_pizza_size_id, BigDecimal p_price, long p_in_stock);

    @Query(value = "call public.sp_pizza_update(?1,?2,?3,?4,?5,0)", nativeQuery = true)
    int sp_pizza_update(long p_pizza_id, String p_pizza_name, long p_pizza_size_id, BigDecimal p_price, long p_in_stock);

    @Query(value = "call public.sp_pizza_delete(?1,0)", nativeQuery = true)
    int sp_pizza_delete(long p_pizza_id);

    @Query(value = "select * from public.fn_pizza_get_all()", nativeQuery = true)
    List<Pizza> fn_pizza_get_all();

    @Query(value = "select * from public.fn_pizza_get_by_pizza_id(?1)", nativeQuery = true)
    Pizza fn_pizza_get_by_pizza_id(long p_pizza_id);
}
