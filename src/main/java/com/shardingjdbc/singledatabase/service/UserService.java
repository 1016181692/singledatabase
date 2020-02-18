package com.shardingjdbc.singledatabase.service;

import com.shardingjdbc.singledatabase.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author navy
 * @version 1.0
 * @date 2020-02-18 14:31
 */
@Component
public interface UserService {
    void add(User user);

    User find(Long id);

    List<User> findByAge(String age);
}
