package com.yh.springbootPractice.controller;

import com.yh.springbootPractice.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequiredArgsConstructor

public class IndexController {
    @GetMapping("/")
    String enterMessage(){
        return "그냥 테스트로 만들어 보는 api입니다.";
    }
}
