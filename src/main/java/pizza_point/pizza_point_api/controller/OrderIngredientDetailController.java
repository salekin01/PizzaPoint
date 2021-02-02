package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.OrderIngredientDetail;
import pizza_point.pizza_point_api.repository.OrderIngredientDetailRepository;

import java.util.List;

@RestController
public class OrderIngredientDetailController {
    @Autowired
    OrderIngredientDetailRepository orderIngredientDetailRepository;

    @GetMapping("/api/orderIngredientDetail")
    public List<OrderIngredientDetail> bakerList() {
        return orderIngredientDetailRepository.fn_order_ingredient_detail_get_all();
    }

    @GetMapping("/api/orderIngredientDetail/{id}")
    public OrderIngredientDetail show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = orderIngredientDetailRepository.fn_order_ingredient_detail_get_by_order_ingredient_detail_id(p_id);
        return result;
    }

    @PostMapping("/api/orderIngredientDetail")
    public int create(@RequestBody OrderIngredientDetail body){
        try {
            orderIngredientDetailRepository.sp_order_ingredient_detail_create(body.getOrderIngredientId(), body.getSupplierGoodsId(), body.getQuantity(), body.getTotalPrice());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
    @PostMapping("/api/orderIngredientDetail/{id}")
    public int update(@RequestBody OrderIngredientDetail body){
        try {
            orderIngredientDetailRepository.sp_order_ingredient_detail_update(body.getOrderIngredientDetailId(), body.getOrderIngredientId(), body.getSupplierGoodsId(), body.getQuantity(), body.getTotalPrice());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @DeleteMapping("/api/orderIngredientDetail/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            orderIngredientDetailRepository.sp_order_ingredient_detail_delete(p_id);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @DeleteMapping("/api/orderIngredientDetailByOrderIngredientId/{id}")
    public int delete_by_order_ingredient_id(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            orderIngredientDetailRepository.sp_order_ingredient_detail_delete_by_order_ingredient_id(p_id);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}
