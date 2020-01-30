package com.johnny.hello.spring.boot.axios.controller;

import com.johnny.hello.spring.boot.axios.domain.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserController {

    @GetMapping(value = "/user")
    public User user() {
        User user = new User();
        user.setUsername("JohnnyHao");

        return user;
    }
}
