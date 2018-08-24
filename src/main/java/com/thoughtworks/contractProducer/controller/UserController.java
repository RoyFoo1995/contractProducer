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

    @GetMapping
    public List<User> get(){
        List<User> users = new ArrayList<>();
        users.add(new User("李四", 12));
        users.add(new User("张三", 14));
        return users;
    }
}
