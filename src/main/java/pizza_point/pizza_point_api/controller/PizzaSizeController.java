package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.PizzaSize;
import pizza_point.pizza_point_api.repository.PizzaSizeRepository;

import java.util.List;

@CrossOrigin
@RestController
public class PizzaSizeController {
    @Autowired
    PizzaSizeRepository pizzaSizeRepository;

    @GetMapping("/api/pizzaSize")
    public List<PizzaSize> pizzaSizeList() {
        return pizzaSizeRepository.fn_pizza_size_get_all();
    }

    @GetMapping("/api/pizzaSize/{id}")
    public PizzaSize show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = pizzaSizeRepository.fn_pizza_size_get_by_category_id(p_id);
        return result;
    }

    @PostMapping("/api/pizzaSize")
    public int create(@RequestBody PizzaSize body){
        try {
            pizzaSizeRepository.sp_pizza_size_create(body.getSizeInInch(), body.getSizeInText(), body.getTotalSlice());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
    @PostMapping("/api/pizzaSize/{id}")
    public int update(@RequestBody PizzaSize body){
        try {
            pizzaSizeRepository.sp_pizza_size_update(body.getPizzaSizeId(), body.getSizeInInch(), body.getSizeInText(), body.getTotalSlice());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @DeleteMapping("/api/pizzaSize/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            pizzaSizeRepository.sp_pizza_size_delete(p_id);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}
