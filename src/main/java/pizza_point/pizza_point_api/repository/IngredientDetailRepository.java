package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.IngredientDetail;

import java.util.List;

@Repository
public interface IngredientDetailRepository extends JpaRepository<IngredientDetail, Long> {
    @Query(value = "call public.sp_ingredient_detail_create(?1,?2,?3,0)", nativeQuery = true)
    int sp_ingredient_detail_create(String p_ingredient_name, long p_ingredient_category_id, long p_regional_province_id);

    @Query(value = "call public.sp_ingredient_detail_update(?1,?2,?3,?4,0)", nativeQuery = true)
    int sp_ingredient_detail_update(long p_ingredient_id, String p_ingredient_name, long p_ingredient_category_id, long p_regional_province_id);

    @Query(value = "call public.sp_ingredient_detail_delete(?1,0)", nativeQuery = true)
    int sp_ingredient_detail_delete(long p_ingredient_id);

    @Query(value = "select * from public.fn_ingredient_detail_get_all()", nativeQuery = true)
    List<IngredientDetail> fn_ingredient_detail_get_all();

    @Query(value = "select * from public.fn_ingredient_detail_get_by_ingredient_id(?1)", nativeQuery = true)
    IngredientDetail fn_ingredient_detail_get_by_ingredient_id(long p_ingredient_id);
}
