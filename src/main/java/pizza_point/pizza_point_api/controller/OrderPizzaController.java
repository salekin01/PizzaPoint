package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.OrderPizza;
import pizza_point.pizza_point_api.repository.OrderPizzaRepository;

import java.util.List;

@RestController
public class OrderPizzaController {
    @Autowired
    OrderPizzaRepository orderPizzaRepository;

    @GetMapping("/api/orderPizza")
    public List<OrderPizza> orderPizzaList() {
        return orderPizzaRepository.fn_order_pizza_get_all();
    }

    @GetMapping("/api/orderPizza/{id}")
    public OrderPizza show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = orderPizzaRepository.fn_order_pizza_get_by_order_pizza_id(p_id);
        return result;
    }

    @PostMapping("/api/orderPizza")
    public int create(@RequestBody OrderPizza body){
        try {
            orderPizzaRepository.sp_order_pizza_create(body.getPizzaId(), body.getCustomerId(), body.getQuantity(),
                                                       body.getDiscount(), body.getTotalPrice(), body.getRequiredDate());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
    @PostMapping("/api/orderPizza/{id}")
    public int update(@RequestBody OrderPizza body){
        try {
            orderPizzaRepository.sp_order_pizza_update(body.getOrderPizzaId(), body.getPizzaId(), body.getCustomerId(),
                                                       body.getQuantity(),body.getDiscount(), body.getTotalPrice(),
                                                       body.getRequiredDate());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @DeleteMapping("/api/orderPizza/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            orderPizzaRepository.sp_order_pizza_delete(p_id);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}
