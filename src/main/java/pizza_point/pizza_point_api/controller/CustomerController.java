package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.Customer;
import pizza_point.pizza_point_api.repository.CustomerRepository;

import java.util.List;

@CrossOrigin
@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/api/customer")
    public List<Customer> customerList() {
        return customerRepository.fn_customer_get_all();
    }

    @GetMapping("/api/customer/{id}")
    public Customer show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = customerRepository.fn_customer_get_by_customer_id(p_id);
        return result;
    }

    @PostMapping("/api/customer")
    public int create(@RequestBody Customer body){
        try {
            customerRepository.sp_customer_create(body.getCustomerName(), body.getAddress(), body.getPhone(),body.getEmail(),body.getShippingInfo());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
    @PostMapping("/api/customer/{id}")
    public int update(@RequestBody Customer body){
        try {
            customerRepository.sp_customer_update(body.getCustomerId(), body.getCustomerName(), body.getAddress(), body.getPhone(),body.getEmail(),body.getShippingInfo());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @DeleteMapping("/api/customer/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            customerRepository.sp_customer_delete(p_id);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}
