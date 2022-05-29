package com.yh.springbootPractice.responseDto;

import com.yh.springbootPractice.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class UserResponseDto {
    private List<User> userList;
}
