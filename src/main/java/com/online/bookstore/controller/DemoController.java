package com.online.bookstore.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/secured")
    public String view(){
        return "W E L C O M E";
    }
}
