package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.Baker;
import pizza_point.pizza_point_api.repository.BakerRepository;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class BakerController {
    @Autowired
    BakerRepository bakerRepository;

    @GetMapping("/api/baker")
    public List<Baker> bakerList() {
        return bakerRepository.fn_baker_get_all();
    }

    @GetMapping("/api/baker/{id}")
    public Baker show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = bakerRepository.fn_baker_get_by_baker_id(p_id);
        return result;
    }

    @PostMapping("/api/baker")
    public int create(@RequestBody Baker body){
        try {
            bakerRepository.sp_baker_create(body.getBakerName(), body.getAddress(), body.getPhone(), body.getEmail());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
    @PostMapping("/api/baker/{id}")
    public int update(@RequestBody Baker body){
        try {
            bakerRepository.sp_baker_update(body.getBakerId(), body.getBakerName(),body.getAddress(),body.getPhone(),body.getEmail());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @DeleteMapping("/api/baker/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            bakerRepository.sp_baker_delete(p_id);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}