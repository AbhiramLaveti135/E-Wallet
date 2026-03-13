package com.gfg.UserService.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.validation.Valid;
import com.gfg.UserService.model.User;
import com.gfg.UserService.request.CreateUserRequest;
import com.gfg.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody @Valid CreateUserRequest createUserRequest) throws JsonProcessingException {
        return userService.createUser(createUserRequest);
    }
    @GetMapping("/getUser")
    public User findUser(@RequestParam("contact") String contact){
        return userService.loadUserByUsername(contact);
    }
}