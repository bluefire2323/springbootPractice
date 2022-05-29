package com.yh.springbootPractice.entity;

import lombok.Data;
import lombok.Getter;

@Data
public class User {

    private Long id;
    private String name;
    private String country;
    private int age;
    private String phoneNumber;
    private int isUse;
}
