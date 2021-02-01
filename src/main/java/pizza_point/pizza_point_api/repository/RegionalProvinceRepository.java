package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.RegionalProvince;

import java.util.List;

@Repository
public interface RegionalProvinceRepository extends JpaRepository<RegionalProvince, Long> {
    @Query(value = "call public.sp_regional_province_create(?1,0)", nativeQuery = true)
    int sp_regional_province_create(String p_province_name);

    @Query(value = "call public.sp_regional_province_update(?1,?2,0)", nativeQuery = true)
    int sp_regional_province_update(long p_province_id, String p_province_name);

    @Query(value = "call public.sp_regional_province_delete(?1,0)", nativeQuery = true)
    int sp_regional_province_delete(long p_province_id);

    @Query(value = "select * from public.fn_regional_province_get_all()", nativeQuery = true)
    List<RegionalProvince> fn_regional_province_get_all();

    @Query(value = "select * from public.fn_regional_province_get_by_category_id(?1)", nativeQuery = true)
    RegionalProvince fn_regional_province_get_by_category_id(long p_province_id);
}
