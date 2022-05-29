package com.yh.springbootPractice.service;

import com.yh.springbootPractice.entity.User;
import com.yh.springbootPractice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.getUserList();
    }
}
