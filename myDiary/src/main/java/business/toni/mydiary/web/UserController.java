package business.toni.mydiary.web;

import business.toni.mydiary.models.User;
import business.toni.mydiary.services.UserService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user/add/")
    public User registerUser(@RequestBody UserDTO userDTO){

       return userService.saveUser(userDTO.getUsername(), userDTO.getPassword());

    }

    @ToString
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class UserDTO {
        private String username;
        private String password;
    }
}
