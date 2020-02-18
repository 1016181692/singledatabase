package com.shardingjdbc.singledatabase.controller;

import com.shardingjdbc.singledatabase.entity.User;
import com.shardingjdbc.singledatabase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author navy
 * @version 1.0
 * @date 2020-02-18 14:20
 */
@RestController
public class userController {
    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public void addUser() {
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("tom" + i);
            user.setSex("1");
            user.setAge(20 + i);
            userService.add(user);
        }
    }

    @RequestMapping("/find")
    public User find(Long id){
        User user = userService.find(id);
        return user;
    }


    @RequestMapping("/findByAge")
    public List<User> find(String age){
        List<User> user = userService.findByAge(age);
        return user;
    }
}

