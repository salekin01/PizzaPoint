package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.Pizza;
import pizza_point.pizza_point_api.repository.PizzaRepository;

import java.util.List;

@RestController
public class PizzaController {
    @Autowired
    PizzaRepository pizzaRepository;

    @GetMapping("/api/pizza")
    public List<Pizza> pizzaList() {
        return pizzaRepository.fn_pizza_get_all();
    }

    @GetMapping("/api/pizza/{id}")
    public Pizza show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = pizzaRepository.fn_pizza_get_by_pizza_id(p_id);
        return result;
    }

    @PostMapping("/api/pizza")
    public int create(@RequestBody Pizza body){
        try {
            pizzaRepository.sp_pizza_create(body.getPizzaName(), body.getPizzaSizeId(), body.getPrice(), body.getInStock());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
    @PostMapping("/api/pizza/{id}")
    public int update(@RequestBody Pizza body){
        try {
            pizzaRepository.sp_pizza_update(body.getPizzaId(), body.getPizzaName(), body.getPizzaSizeId(), body.getPrice(), body.getInStock());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @DeleteMapping("/api/pizza/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            pizzaRepository.sp_pizza_delete(p_id);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}
