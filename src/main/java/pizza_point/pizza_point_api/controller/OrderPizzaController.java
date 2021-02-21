package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.OrderPizza;
import pizza_point.pizza_point_api.repository.OrderPizzaRepository;

import java.util.List;

@CrossOrigin
@RestController
public class OrderPizzaController {
    @Autowired
    OrderPizzaRepository orderPizzaRepository;

    @GetMapping("/api/orderPizza")
    public List<OrderPizza> orderPizzaList() {
        return orderPizzaRepository.fn_order_pizza_get_all();
    }

    @GetMapping("/api/orderPizzaByCustomerEmail/{email}")
    public List<OrderPizza> orderPizzaList(@PathVariable String email) {
        return orderPizzaRepository.fn_order_pizza_get_all_By_Customer_Email(email);
    }

    @GetMapping("/api/orderPizza/{id}")
    public OrderPizza show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = orderPizzaRepository.fn_order_pizza_get_by_order_pizza_id(p_id);
        return result;
    }

    @PostMapping("/api/orderPizza")
    public long create(@RequestBody OrderPizza body){
        try {
            var ordered_pizza_id = orderPizzaRepository.sp_order_pizza_create(body.getPizzaId(), body.getQuantity(),
                                                       body.getDiscount(), body.getTotalPrice(), body.getEmail());
            if(ordered_pizza_id > 0) {
                return ordered_pizza_id;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @PostMapping("/api/orderPizzaCancel")
    public long cancelOrder(@RequestBody OrderPizza body){
        try {
            var result = orderPizzaRepository.sp_order_pizza_cancel(body.getOrderPizzaId(), body.getCanceled());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @PostMapping("/api/orderPizza/{id}")
    public int update(@RequestBody OrderPizza body){
        try {
            var result = orderPizzaRepository.sp_order_pizza_update(body.getOrderPizzaId(), body.getPizzaId(), body.getCustomerId(),
                                                       body.getQuantity(),body.getDiscount(), body.getTotalPrice(),
                                                       body.getRequiredDate());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @DeleteMapping("/api/orderPizza/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            var result = orderPizzaRepository.sp_order_pizza_delete(p_id);
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }
}
