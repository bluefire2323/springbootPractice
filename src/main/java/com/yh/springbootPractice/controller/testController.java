package com.yh.springbootPractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class testController {

    @GetMapping("/t")
    public String testMethod() {
        return "웹페이지";
    }
    @GetMapping("/json")
    public Map<String, Integer> testJsonMethod() {
        HashMap<String, Integer> map =  new HashMap<>();

        map.put("age", 10);
        map.put("birthday", 2008);
        return map;
    }
    @GetMapping("/list")
    public List<Map<String, String>> testListMethod() {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("name", "최윤형");
        map1.put("subject", "java");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("name", "스티브");
        map2.put("subject", "iphone");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("name", "빌게이츠");
        map3.put("subject", "MS");
        ArrayList returnData = new ArrayList();
        returnData.add(map1);
        returnData.add(map2);
        returnData.add(map3);

        return returnData;
    }
}
