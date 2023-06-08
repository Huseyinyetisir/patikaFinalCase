package com.huseyinyetisir.WeatherApp.mapper;

import com.huseyinyetisir.WeatherApp.dto.user.UserDTO;
import com.huseyinyetisir.WeatherApp.dto.user.UserSaveRequest;
import com.huseyinyetisir.WeatherApp.dto.user.UserUpdatePasswordRequest;
import com.huseyinyetisir.WeatherApp.entity.AppUser;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    AppUser convertToUser(UserSaveRequest request);

    UserDTO convertToUserDTO(AppUser appUser);

    AppUser convertToUser(UserUpdatePasswordRequest request);

    List<UserDTO> convertToUserDtoList(List<AppUser> userList);

}