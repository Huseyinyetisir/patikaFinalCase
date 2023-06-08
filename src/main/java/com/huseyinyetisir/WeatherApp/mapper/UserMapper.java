package com.huseyinyetisir.WeatherApp.mapper;


import com.huseyinyetisir.WeatherApp.dto.user.UserDTO;
import com.huseyinyetisir.WeatherApp.dto.user.UserSaveRequest;
import com.huseyinyetisir.WeatherApp.dto.user.UserUpdateRequest;
import com.huseyinyetisir.WeatherApp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User convertToUser(UserSaveRequest request);
    
    UserDTO convertToUserDTO(User user);

    User convertToUser(UserUpdateRequest request);
}
