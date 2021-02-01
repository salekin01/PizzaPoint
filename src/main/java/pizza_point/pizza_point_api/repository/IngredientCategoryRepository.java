package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.IngredientCategory;

import java.util.List;

@Repository
public interface IngredientCategoryRepository extends JpaRepository<IngredientCategory, Long> {

    @Query(value = "call public.sp_ingredient_category_create(?1,0)", nativeQuery = true)
    int sp_ingredient_category_create(String p_category_name);

    @Query(value = "call public.sp_ingredient_category_update(?1,?2,0)", nativeQuery = true)
    int sp_ingredient_category_update(long p_category_id, String p_category_name);

    @Query(value = "call public.sp_ingredient_category_delete(?1,0)", nativeQuery = true)
    int sp_ingredient_category_delete(long p_category_id);

    @Query(value = "select * from public.fn_ingredient_category_get_all()", nativeQuery = true)
    List<IngredientCategory> fn_ingredient_category_get_all();

    @Query(value = "select * from public.fn_ingredient_category_get_by_category_id(?1)", nativeQuery = true)
    IngredientCategory fn_ingredient_category_get_by_category_id(long p_category_id);
}
