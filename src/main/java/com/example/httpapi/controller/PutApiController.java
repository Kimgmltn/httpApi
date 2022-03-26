package com.example.httpapi.controller;

import com.example.httpapi.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/put")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody PutRequestDto putRequestDto){
        System.out.println(putRequestDto.toString());
    }

    @PutMapping("/put/{userId}")
    public void putByUserId(@RequestBody PutRequestDto putRequestDto, @PathVariable Long userId){
        System.out.println(putRequestDto.toString());
        System.out.println(userId);
    }
}
