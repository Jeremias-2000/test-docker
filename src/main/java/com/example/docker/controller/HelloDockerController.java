package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/docker")
public class HelloDockerController {

    @GetMapping("/")
    public String hello(){
        return "Hello Docker !!";
    }
}
