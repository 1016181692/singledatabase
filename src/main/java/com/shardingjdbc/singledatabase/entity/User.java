package com.shardingjdbc.singledatabase.entity;

import lombok.Data;

import java.math.BigInteger;

/**
 * @author navy
 * @version 1.0
 * @date 2020-02-18 14:17
 */
@Data
public class User {

    private Long id;

    private String name;

    private String sex;

    private Integer age;

}
