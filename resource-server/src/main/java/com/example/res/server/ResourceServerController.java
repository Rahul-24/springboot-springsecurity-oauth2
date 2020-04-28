package com.example.res.server;

import org.springframework.web.bind.annotation.*;


@RestController
public class ResourceServerController {

    @GetMapping("/hello")
    public String getHello(@RequestParam String name) {
        return "Hello "+name;
    }
}
