package com.example.ourdiary.web;

import com.example.ourdiary.models.User;
import com.example.ourdiary.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("user/add")
    public User createUser(@RequestBody RegisterDto dTo){
        return userService.save(dTo);
    }
}
