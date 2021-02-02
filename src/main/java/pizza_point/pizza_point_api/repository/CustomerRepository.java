package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "call public.sp_customer_create(?1,?2,?3,?4,?5,0)", nativeQuery = true)
    int sp_customer_create(String p_customer_name, String p_address, String p_phone, String p_email, String p_shipping_info);

    @Query(value = "call public.sp_customer_update(?1,?2,?3,?4,?5,?6,0)", nativeQuery = true)
    int sp_customer_update(long p_customer_id, String p_customer_name, String p_address, String p_phone, String p_email, String p_shipping_info);

    @Query(value = "call public.sp_customer_delete(?1,0)", nativeQuery = true)
    int sp_customer_delete(long p_customer_id);

    @Query(value = "select * from public.fn_customer_get_all()", nativeQuery = true)
    List<Customer> fn_customer_get_all();

    @Query(value = "select * from public.fn_customer_get_by_customer_id(?1)", nativeQuery = true)
    Customer fn_customer_get_by_customer_id(long p_customer_id);
}
