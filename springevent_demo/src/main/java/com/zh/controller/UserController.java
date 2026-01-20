package com.zh.controller;

import com.zh.dto.OptLogDTO;
import com.zh.event.SysLogEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/getUser")
    public String getUser(){

        OptLogDTO logDTO = new OptLogDTO();
        logDTO.setRequestIp("127.0.0.1");
        logDTO.setUserName("zh");
        logDTO.setType("OPT");
        logDTO.setDescription("查询用户信息");

        ApplicationEvent event=new SysLogEvent(logDTO);

        applicationContext.publishEvent(event);

        long id =Thread.currentThread().getId();
        System.out.println("发布事件，线程ID："+id);
        return "OK";

    }
}
