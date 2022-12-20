package com.oneproject.zipcodeTC.timecapsule.service;

import com.oneproject.zipcodeTC.timecapsule.dto.RegisterRequestDTO;
import com.oneproject.zipcodeTC.timecapsule.model.User;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class AuthService {

    public void signup(RegisterRequestDTO registerRequestDTO){
        User user = new User();
        user.setUsername(registerRequestDTO.getUsername());
        user.setEmail(registerRequestDTO.getEmail());
        user.setPassword(registerRequestDTO.getPassword());
        user.setCreated(Instant.now());
        user.setEnabled(false);
    }
}
