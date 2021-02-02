package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.Supplier;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    @Query(value = "call public.sp_supplier_create(?1,?2,?3,?4,?5,?6,?7,0)", nativeQuery = true)
    int sp_supplier_create(String p_supplier_name, String p_address, String p_city, long p_postal_code, String p_phone, String p_email, boolean p_hidden);

    @Query(value = "call public.sp_supplier_update(?1,?2,?3,?4,?5,?6,?7,?8,0)", nativeQuery = true)
    int sp_supplier_update(long p_supplier_id, String p_supplier_name, String p_address, String p_city, long p_postal_code, String p_phone, String p_email, boolean p_hidden);

    @Query(value = "call public.sp_supplier_delete(?1,0)", nativeQuery = true)
    int sp_supplier_delete(long p_supplier_id);

    @Query(value = "select * from public.fn_supplier_get_all()", nativeQuery = true)
    List<Supplier> fn_supplier_get_all();

    @Query(value = "select * from public.fn_supplier_get_by_supplier_id(?1)", nativeQuery = true)
    Supplier fn_supplier_get_by_supplier_id(long p_supplier_id);
}
