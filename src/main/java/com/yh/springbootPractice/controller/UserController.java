package com.yh.springbootPractice.controller;

import com.yh.springbootPractice.entity.User;
import com.yh.springbootPractice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/userApi")
@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    // user list를 가져오는 api
    @GetMapping("/userList")
    public List<User> getUserList() {
        return userService.getUserList();
    }
}
