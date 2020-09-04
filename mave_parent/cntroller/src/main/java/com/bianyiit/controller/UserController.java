package com.bianyiit.controller;
import com.bianyiit.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService service;
    @RequestMapping("/user")
    public void show(){
        for (User user : service.findAll()) {
            System.out.println(user);
        }
    }
}
