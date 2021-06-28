package com.example.ourdiary.services;

import com.example.ourdiary.models.User;
import com.example.ourdiary.repository.UserRepository;
import com.example.ourdiary.web.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserRepository userRepository;

    public User save(RegisterDto registerDto){
        User user = new User();
        user.setUserName(registerDto.getUsername());
        user.setPassword(registerDto.getPassword());
        return userRepository.save(user);
    }
}
