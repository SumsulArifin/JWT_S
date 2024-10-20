package com.example.jwt_squirty.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/api")
@CrossOrigin("*")
public class UserController {

    @GetMapping("/")
    public String uploadUserWithImage() {
        return "Hello";
    }


}
