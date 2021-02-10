package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.OrderPizzaDetail;
import pizza_point.pizza_point_api.repository.OrderPizzaDetailRepository;

import java.util.List;

@CrossOrigin
@RestController
public class OrderPizzaDetailController {
    @Autowired
    OrderPizzaDetailRepository orderPizzaDetailRepository;

    @GetMapping("/api/orderPizzaDetail")
    public List<OrderPizzaDetail> orderPizzaDetailList() {
        return orderPizzaDetailRepository.fn_order_pizza_detail_get_all();
    }

    @GetMapping("/api/orderPizzaDetailByPizzaId/{id}")
    public List<OrderPizzaDetail> orderPizzaDetailListByPizzaId(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = orderPizzaDetailRepository.fn_order_pizza_detail_get_by_order_pizza_id(p_id);
        return result;
    }

    @GetMapping("/api/orderPizzaDetail/{id}")
    public OrderPizzaDetail show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = orderPizzaDetailRepository.fn_order_pizza_detail_get_by_detail_id(p_id);
        return result;
    }

    @PostMapping("/api/orderPizzaDetail")
    public int create(@RequestBody OrderPizzaDetail body){
        try {
            var result = orderPizzaDetailRepository.sp_order_pizza_detail_create(body.getOrderPizzaId(), body.getBakerGoodsId());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @PostMapping("/api/orderPizzaDetailByOrderedId/{orderPizzaId}")
    public int createByOrderedId(@PathVariable long orderPizzaId, @RequestBody OrderPizzaDetail body){
        try {
            var result = orderPizzaDetailRepository.sp_order_pizza_detail_create_by_ordered_id(orderPizzaId, body.getBakerGoodsId());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @PostMapping("/api/orderPizzaDetail/{id}")
    public int update(@RequestBody OrderPizzaDetail body){
        try {
            var result = orderPizzaDetailRepository.sp_order_pizza_detail_update(body.getOrderPizzaDetailId(), body.getOrderPizzaId(), body.getBakerGoodsId());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @DeleteMapping("/api/orderPizzaDetail/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            var result = orderPizzaDetailRepository.sp_order_pizza_detail_delete(p_id);
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @DeleteMapping("/api/orderPizzaDetailByOrderPizzaId/{id}")
    public int deleteByOrderPizzaId(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            var result = orderPizzaDetailRepository.sp_order_pizza_detail_delete_by_order_pizza_id(p_id);
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }
}
