package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.IngredientCategory;
import pizza_point.pizza_point_api.repository.IngredientCategoryRepository;

import java.util.List;

@CrossOrigin
@RestController
public class IngredientCategoryController {
    @Autowired
    IngredientCategoryRepository ingredientCategoryRepository;

    @GetMapping("/api/ingredientCategory")
    public List<IngredientCategory> ingredientCategoryList() {
        return ingredientCategoryRepository.fn_ingredient_category_get_all();
    }

    @GetMapping("/api/ingredientCategory/{id}")
    public IngredientCategory show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = ingredientCategoryRepository.fn_ingredient_category_get_by_category_id(p_id);
        return result;
    }

    @PostMapping("/api/ingredientCategory")
    public int create(@RequestBody IngredientCategory body){
        try {
            var result = ingredientCategoryRepository.sp_ingredient_category_create(body.getCategoryName());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }
    @PostMapping("/api/ingredientCategory/{id}")
    public int update(@RequestBody IngredientCategory body){
        try {
            var result = ingredientCategoryRepository.sp_ingredient_category_update(body.getIngredientCategoryId(), body.getCategoryName());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @DeleteMapping("/api/ingredientCategory/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            var result = ingredientCategoryRepository.sp_ingredient_category_delete(p_id);
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }
}
