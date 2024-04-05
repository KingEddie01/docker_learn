package com.docker_learning.docker_learninng.repository;

import com.docker_learning.docker_learninng.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
