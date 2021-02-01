package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.Baker;

import java.util.List;

@Repository
public interface BakerRepository extends JpaRepository<Baker, Long> {
//    @Query(value = "call public.sp_baker_create(:p_name,:p_address,:p_phone,:p_email,0)", nativeQuery = true)
//    int sp_baker_create(
//            @Param("p_name") String name,
//            @Param("p_address") String address,
//            @Param("p_phone") String phone,
//            @Param("p_email") String email);
    @Query(value = "call public.sp_baker_create(?1,?2,?3,?4,0)", nativeQuery = true)
    int sp_baker_create(String p_name, String p_address, String p_phone, String p_email);

    @Query(value = "call public.sp_baker_update(?1,?2,?3,?4,?5,0)", nativeQuery = true)
    int sp_baker_update(long p_baker_id, String p_name, String p_address, String p_phone, String p_email);

    @Query(value = "call public.sp_baker_delete(?1,0)", nativeQuery = true)
    int sp_baker_delete(long p_baker_id);

    @Query(value = "select * from public.fn_baker_get_all()", nativeQuery = true)
    List<Baker> fn_baker_get_all();

    @Query(value = "select * from public.fn_baker_get_by_baker_id(?1)", nativeQuery = true)
    Baker fn_baker_get_by_baker_id(long p_baker_id);

}