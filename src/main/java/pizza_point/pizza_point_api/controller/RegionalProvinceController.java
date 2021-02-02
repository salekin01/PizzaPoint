package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.RegionalProvince;
import pizza_point.pizza_point_api.repository.RegionalProvinceRepository;

import java.util.List;

@RestController
public class RegionalProvinceController {
    @Autowired
    RegionalProvinceRepository regionalProvinceRepository;

    @GetMapping("/api/regionalProvince")
    public List<RegionalProvince> regionalProvinceList() {
        return regionalProvinceRepository.fn_regional_province_get_all();
    }

    @GetMapping("/api/regionalProvince/{id}")
    public RegionalProvince show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = regionalProvinceRepository.fn_regional_province_get_by_category_id(p_id);
        return result;
    }

    @PostMapping("/api/regionalProvince")
    public int create(@RequestBody RegionalProvince body){
        try {
            regionalProvinceRepository.sp_regional_province_create(body.getRegionalProvinceName());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
    @PostMapping("/api/regionalProvince/{id}")
    public int update(@RequestBody RegionalProvince body){
        try {
            regionalProvinceRepository.sp_regional_province_update(body.getRegionalProvinceId(), body.getRegionalProvinceName());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @DeleteMapping("/api/regionalProvince/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            regionalProvinceRepository.sp_regional_province_delete(p_id);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}
