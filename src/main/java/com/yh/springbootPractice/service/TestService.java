package com.yh.springbootPractice.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public int calculator(int num1, int num2){
        return num1 + num2;
    }
}
