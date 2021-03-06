package com.thoughtworks.contractProducer.controller;

import com.thoughtworks.contractProducer.model.User;
import com.thoughtworks.contractProducer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> get(){
        System.out.println(userService.getAll());
        return userService.getAll();
    }
}
