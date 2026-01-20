package com.zh.controller;

import com.zh.annotation.CurrentUser;
import com.zh.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @GetMapping("/getCurrentUser")
    public String getCurrentUser(@CurrentUser User user) {
        String name = user.getUsername();
        System.out.println("UserController getCurrentUser: " + name);
        return user.toString();
    }
}
