package com.shardingjdbc.singledatabase.service;

import com.google.common.base.Strings;
import com.shardingjdbc.singledatabase.dao.UserDao;
import com.shardingjdbc.singledatabase.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

/**
 * @author navy
 * @version 1.0
 * @date 2020-02-18 14:22
 */
@Service
public class userServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.insert(user);
    }


    @Override
    public User find(Long id) {
        User user = userDao.select(id);
        return user;

    }

    @Override
    public List<User> findByAge(String age) {
        List<User> user = userDao.findByAge(age);
        return user;

    }
}