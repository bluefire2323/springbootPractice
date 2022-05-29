package com.yh.springbootPractice.repository;

import com.yh.springbootPractice.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository {

    List<User> getUserList();
}
