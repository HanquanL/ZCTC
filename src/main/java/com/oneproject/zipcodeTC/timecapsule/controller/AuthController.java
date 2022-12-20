package com.oneproject.zipcodeTC.timecapsule.controller;

import com.oneproject.zipcodeTC.timecapsule.dto.RegisterRequestDTO;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/signup")
    public void signup(@RequestBody RegisterRequestDTO registerRequestDTO){

    }
}
