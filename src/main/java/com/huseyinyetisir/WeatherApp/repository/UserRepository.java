package com.huseyinyetisir.WeatherApp.repository;

import com.huseyinyetisir.WeatherApp.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser,Long> {

    AppUser findAppUserByUsername(String username);

}
