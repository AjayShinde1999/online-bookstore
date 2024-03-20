package com.online.bookstore.controller;

import com.online.bookstore.payload.UserDto;
import com.online.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Void> userRegistration(@RequestBody UserDto userDto) {
        userService.userRegistration(userDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
