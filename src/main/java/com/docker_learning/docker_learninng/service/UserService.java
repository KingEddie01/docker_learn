package com.docker_learning.docker_learninng.service;

import com.docker_learning.docker_learninng.model.User;
import com.docker_learning.docker_learninng.repository.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    private UserRepository userRepository;
    @Override
    public String addNewUser(User user) {
         userRepository.save(user);
         return "User created successfully";
    }
}
