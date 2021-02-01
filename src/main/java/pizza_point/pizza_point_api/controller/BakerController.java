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

    @PostMapping("/baker")
    public void create(@RequestBody Baker body){
        try {
            bakerRepository.sp_baker_create(body.getBakerName(), body.getAddress(), body.getPhone(), body.getEmail());
        }
        catch (Exception e){
        }
    }
}