package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.IngredientDetail;
import pizza_point.pizza_point_api.repository.IngredientDetailRepository;

import java.util.List;

@RestController
public class IngredientDetailController {
    @Autowired
    IngredientDetailRepository ingredientDetailRepository;

    @GetMapping("/api/ingredientDetail")
    public List<IngredientDetail> bakerList() {
        return ingredientDetailRepository.fn_ingredient_detail_get_all();
    }

    @GetMapping("/api/ingredientDetail/{id}")
    public IngredientDetail show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = ingredientDetailRepository.fn_ingredient_detail_get_by_ingredient_id(p_id);
        return result;
    }

    @PostMapping("/api/ingredientDetail")
    public int create(@RequestBody IngredientDetail body){
        try {
            ingredientDetailRepository.sp_ingredient_detail_create(body.getIngredientName(), body.getIngredientCategoryId(), body.getRegionalProvinceId());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
    @PostMapping("/api/ingredientDetail/{id}")
    public int update(@RequestBody IngredientDetail body){
        try {
            ingredientDetailRepository.sp_ingredient_detail_update(body.getIngredientId(), body.getIngredientName(), body.getIngredientCategoryId(), body.getRegionalProvinceId());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @DeleteMapping("/api/ingredientDetail/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            ingredientDetailRepository.sp_ingredient_detail_delete(p_id);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}
