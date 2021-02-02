package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.PizzaSize;

import java.util.List;

@Repository
public interface PizzaSizeRepository extends JpaRepository<PizzaSize, Long> {
    @Query(value = "call public.sp_pizza_size_create(?1,?2,?3,0)", nativeQuery = true)
    int sp_pizza_size_create(int p_size_in_inch, String p_size_in_text, int p_total_slice);

    @Query(value = "call public.sp_pizza_size_update(?1,?2,?3,?4,0)", nativeQuery = true)
    int sp_pizza_size_update(long p_pizza_size_id, int p_size_in_inch, String p_size_in_text, int p_total_slice);

    @Query(value = "call public.sp_pizza_size_delete(?1,0)", nativeQuery = true)
    int sp_pizza_size_delete(long p_pizza_size_id);

    @Query(value = "select * from public.fn_pizza_size_get_all()", nativeQuery = true)
    List<PizzaSize> fn_pizza_size_get_all();

    @Query(value = "select * from public.fn_pizza_size_get_by_category_id(?1)", nativeQuery = true)
    PizzaSize fn_pizza_size_get_by_category_id(long p_pizza_size_id);
}
