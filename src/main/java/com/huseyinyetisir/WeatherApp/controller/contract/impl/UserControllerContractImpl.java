package com.huseyinyetisir.WeatherApp.controller.contract.impl;

import com.huseyinyetisir.WeatherApp.controller.contract.UserControllerContract;
import com.huseyinyetisir.WeatherApp.dto.user.UserDTO;
import com.huseyinyetisir.WeatherApp.dto.user.UserSaveRequest;
import com.huseyinyetisir.WeatherApp.dto.user.UserUpdatePasswordRequest;
import com.huseyinyetisir.WeatherApp.entity.AppUser;
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
        AppUser AppUser = UserMapper.INSTANCE.convertToUser(request);
        AppUser =userService.save(AppUser);
        return UserMapper.INSTANCE.convertToUserDTO(AppUser);
    }
    @Override
    public List<UserDTO> findAll(){
        List<AppUser> userList = userService.findAll();
        return UserMapper.INSTANCE.convertToUserDtoList(userList);
    }

    @Override
    public UserDTO findById(Long id) {
        AppUser AppUser = userService.findByIdWithControl(id);
        return UserMapper.INSTANCE.convertToUserDTO(AppUser);
    }


    @Override
    public UserDTO findByUsername(String username) {
        AppUser AppUser = userService.findByUsername(username);
        return UserMapper.INSTANCE.convertToUserDTO(AppUser);
    }

    @Override
    public UserDTO update(String username, UserUpdatePasswordRequest request) {
        AppUser AppUser = userService.update(username, request);
        return UserMapper.INSTANCE.convertToUserDTO(AppUser);
    }
    
}
