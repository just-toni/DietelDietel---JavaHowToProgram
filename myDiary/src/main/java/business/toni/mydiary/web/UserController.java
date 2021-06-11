package business.toni.mydiary.web;

import business.toni.mydiary.models.User;
import business.toni.mydiary.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user/add/{userName}/{password}")
    public User registerUser(@PathVariable("userName") String username, @PathVariable("password") String password ){

       return userService.saveUser(username, password);

    }
}
