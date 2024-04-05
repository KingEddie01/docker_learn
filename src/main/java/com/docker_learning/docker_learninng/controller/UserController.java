package com.docker_learning.docker_learninng.controller;

import com.docker_learning.docker_learninng.DTO.DtoRequest;
import com.docker_learning.docker_learninng.model.User;
import com.docker_learning.docker_learninng.service.IUserService;
import com.docker_learning.docker_learninng.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userService = new UserService();

    @PostMapping("/add-user")
    public User registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
        return user;

    }


}
