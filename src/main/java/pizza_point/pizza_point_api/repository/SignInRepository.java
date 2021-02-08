package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.Customer;
import pizza_point.pizza_point_api.model.User;

@Repository
public interface SignInRepository extends JpaRepository<Customer, Long>{
    @Query(value = "select * from public.fn_sign_in_check(?1,?2)", nativeQuery = true)
    int fn_sign_in_check(String p_email, String p_password);
}
