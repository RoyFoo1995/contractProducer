package com.thoughtworks.contractProducer.service;

import com.thoughtworks.contractProducer.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        users.add(new User("李四", 12));
        users.add(new User("张三", 14));
        return users;
    }
}
