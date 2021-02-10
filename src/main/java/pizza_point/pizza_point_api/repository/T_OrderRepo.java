package pizza_point.pizza_point_api.repository;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.T_Order;

@JsonSerialize
@Repository
public interface T_OrderRepo  extends JpaRepository<T_Order, Long> {
    @NonNull
    @Query(value = "select * from public.fn_order_ingredient_create(?1)", nativeQuery = true)
    int fn_order_ingredient_create(@Nullable T_Order[] orderIngredient);
}
