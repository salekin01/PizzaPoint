package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.OrderIngredient;
import pizza_point.pizza_point_api.repository.OrderIngredientRepository;

import java.util.List;

@CrossOrigin
@RestController
public class OrderIngredientController {
    @Autowired
    OrderIngredientRepository orderIngredientRepository;

    @GetMapping("/api/orderIngredient")
    public List<OrderIngredient> orderIngredientList() {
        return orderIngredientRepository.fn_order_ingredient_get_all();
    }

    @GetMapping("/api/orderIngredient/{id}")
    public OrderIngredient show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = orderIngredientRepository.fn_order_ingredient_get_by_order_ingredient_id(p_id);
        return result;
    }

    @PostMapping("/api/orderIngredient")
    public int create(@RequestBody OrderIngredient body){
        try {
            var result = orderIngredientRepository.sp_order_ingredient_create(body.getBakerId(), body.getSupplierId(), body.getRequiredDate());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }
    @PostMapping("/api/orderIngredient/{id}")
    public int update(@RequestBody OrderIngredient body){
        try {
            var result = orderIngredientRepository.sp_order_ingredient_update(body.getOrderIngredientId(), body.getBakerId(),
                                                                 body.getSupplierId(), body.getRequiredDate());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @DeleteMapping("/api/orderIngredient/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            var result = orderIngredientRepository.sp_order_ingredient_delete(p_id);
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }
}
