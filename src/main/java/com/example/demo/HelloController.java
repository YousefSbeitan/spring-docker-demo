package com.example.demo;

import com.example.demo.Message;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    private final HelloService helloService;
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
    @GetMapping("/hello")
    public String hello() {
        return helloService.getMessage();
    }
}

