package com.huseyinyetisir.WeatherApp.repository;

import com.huseyinyetisir.WeatherApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByUsername(String username);
}
