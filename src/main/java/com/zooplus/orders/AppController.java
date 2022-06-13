package com.zooplus.orders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String start() {
        return "Welcome Orders Management Api!";
    }
}
