package com.gnswp21.docker_debug;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {
    @GetMapping
    public String hello(){
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        return "hello, Debuger22";
    }
}