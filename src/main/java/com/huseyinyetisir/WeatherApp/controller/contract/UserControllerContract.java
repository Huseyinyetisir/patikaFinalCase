package com.huseyinyetisir.WeatherApp.controller.contract;

import com.huseyinyetisir.WeatherApp.dto.user.UserDTO;
import com.huseyinyetisir.WeatherApp.dto.user.UserSaveRequest;
import com.huseyinyetisir.WeatherApp.dto.user.UserUpdatePasswordRequest;

import java.util.List;

public interface UserControllerContract {

    UserDTO save(UserSaveRequest request);


    UserDTO findById(Long id);

    UserDTO findByUsername(String username);

    UserDTO update(String username, UserUpdatePasswordRequest request);

    List<UserDTO> findAll();
}
