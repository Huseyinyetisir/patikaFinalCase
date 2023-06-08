package com.huseyinyetisir.WeatherApp.controller.contract.impl;

import com.huseyinyetisir.WeatherApp.controller.contract.UserControllerContract;
import com.huseyinyetisir.WeatherApp.dto.user.UserDTO;
import com.huseyinyetisir.WeatherApp.dto.user.UserSaveRequest;
import com.huseyinyetisir.WeatherApp.dto.user.UserUpdateRequest;
import com.huseyinyetisir.WeatherApp.entity.User;
import com.huseyinyetisir.WeatherApp.mapper.UserMapper;
import com.huseyinyetisir.WeatherApp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserControllerContractImpl implements UserControllerContract {
    
    
    private final UserService userService;

    @Override
    public UserDTO save(UserSaveRequest request) {
        User User = UserMapper.INSTANCE.convertToUser(request);
        User=userService.save(User);
        return UserMapper.INSTANCE.convertToUserDTO(User);
    }


    @Override
    public UserDTO findById(Long id) {
        User User = userService.findByIdWithControl(id);
        return UserMapper.INSTANCE.convertToUserDTO(User);
    }


    @Override
    public UserDTO findByUsername(String username) {
        User User = userService.findByUsername(username);
        return UserMapper.INSTANCE.convertToUserDTO(User);
    }

    @Override
    public UserDTO update(String username, UserUpdateRequest request) {
        User User = userService.update(username, request);
        return UserMapper.INSTANCE.convertToUserDTO(User);
    }
    
}
