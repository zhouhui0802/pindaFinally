package com.zh.controller;

import com.zh.entity.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    @RequestMapping("/delete")
    public String delete(@NotBlank(message="id不能为空") String id){
        System.out.println("delete..."+id);
        return "OK";
    }

    @RequestMapping("/save")
    public String save(@Validated User user){
        System.out.println("save..."+user);
        return "OK";
    }
}
