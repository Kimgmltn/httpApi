package com.example.httpapi.controller;

import com.example.httpapi.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/response")
public class ResponseController {

    // text로 response하기
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    // JSON으로 response하기
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;
    }

    // 권장 방법. 헤더값 변경 가능 + 응답 변경 가능
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
