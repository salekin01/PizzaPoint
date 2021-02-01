package pizza_point.pizza_point_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pizza_point.pizza_point_api.repository.BakerRepository;

import java.sql.*;

@SpringBootApplication
public class PizzaPointApiApplication {

    public static void main(String[] args){
        ApplicationContext c = SpringApplication.run(PizzaPointApiApplication.class, args);

        BakerRepository repo = c.getBean(BakerRepository.class);
        //var create = repo.sp_baker_create("tuhin", "bangladesh", "81191144", "tuhin@gmail.com");
        //var update = repo.sp_baker_update(1,"salekin", "usa", "911", "salekin@gmail.com");
        //var delete = repo.sp_baker_delete(24);
        //var allBaker = repo.fn_baker_get_all();
        //var singleBaker = repo.fn_baker_get_by_baker_id(29);
    }
}
