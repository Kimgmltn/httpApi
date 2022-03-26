package com.example.httpapi.controller;

import com.example.httpapi.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/page")
public class PageController {

    @GetMapping("/main")
    public String main(){
        return "main.html";
    }

    // 1. 타입값으로 반환
    // 2. ResponseEntity 사용
    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("kim");
        user.setAddress("패스트캠퍼스");
        return user;
    }
}
