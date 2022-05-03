package com.wxm.userservice.controller;

import com.wxm.feignclient.user.dto.UserDTO;
import com.wxm.userservice.domain.User;
import com.wxm.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public UserDTO getUser(@PathVariable(value = "id") String userId) {
        return userService.getUserByid(userId);
    }
}
