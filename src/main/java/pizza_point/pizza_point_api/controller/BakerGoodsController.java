package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.BakerGoods;
import pizza_point.pizza_point_api.repository.BakerGoodsRepository;

import java.util.List;

@CrossOrigin
@RestController
public class BakerGoodsController {
    @Autowired
    BakerGoodsRepository bakerGoodsRepository;

    @GetMapping("/api/bakerGoods")
    public List<BakerGoods> bakerGoodsList() {
        var result = bakerGoodsRepository.fn_baker_goods_get_all();
        return result;
    }

    @GetMapping("/api/bakerGoods/{id}")
    public BakerGoods show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = bakerGoodsRepository.fn_baker_goods_get_by_baker_goods_id(p_id);
        return result;
    }

    @PostMapping("/api/bakerGoods")
    public int create(@RequestBody BakerGoods body){
        try {
            var result = bakerGoodsRepository.sp_baker_goods_create(body.getIngredientId(), body.getQuantityPerUnit(), body.getUnitPrice(),
                                                       body.getUnitsInStock(), body.getHidden());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }
    @PostMapping("/api/bakerGoods/{id}")
    public int update(@RequestBody BakerGoods body){
        try {
            var result = bakerGoodsRepository.sp_baker_goods_update(body.getBakerGoodsId(), body.getIngredientId(), body.getQuantityPerUnit(),
                                                       body.getUnitPrice(),body.getUnitsInStock(), body.getHidden());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @DeleteMapping("/api/bakerGoods/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            var result = bakerGoodsRepository.sp_baker_goods_delete(p_id);
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }
}
