package com.shardingjdbc.singledatabase.dao;

import com.shardingjdbc.singledatabase.entity.User;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

/**
 * @author navy
 * @version 1.0
 * @date 2020-02-18 14:14
 */
@Repository
public interface UserDao {

    void insert(User user);
    User select(Long id);
    List<User> findByAge(String age);
}
