package com.example.ourdiary.services;

import com.example.ourdiary.models.User;
import com.example.ourdiary.web.RegisterDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User save(RegisterDto register);
}
