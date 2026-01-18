package com.zh.service;

public class HelloService {

    private String name;
    private String address;

    public HelloService(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String sayHello(){
        return "你好！我的名字叫 ："+name+", 来自"+address;
    }
}
