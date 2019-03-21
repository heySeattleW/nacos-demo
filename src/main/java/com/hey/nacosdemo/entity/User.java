package com.hey.nacosdemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @ClassName User
 * @Author hey
 * @Date 2019/3/18 10:39
 **/
@Data
@Entity
public class User {
    @Id
    private Integer id;
    private String username;
}
