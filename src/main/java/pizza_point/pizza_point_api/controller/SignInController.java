package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pizza_point.pizza_point_api.model.User;
import pizza_point.pizza_point_api.repository.SignInRepository;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class SignInController {
    @Autowired
    SignInRepository signInRepository;

    @PostMapping("/api/SignIn")
    public User SignInCheck(@RequestBody User body){
        try {
            int result = signInRepository.fn_sign_in_check(body.getEmail(), body.getPassword());
            User obj = new User();
            obj.setRoleId(result);
            return obj;
        }
        catch (Exception e){
            return null;
        }
    }
}
