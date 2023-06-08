package com.huseyinyetisir.WeatherApp.dto.user;

public record UserSaveRequest(String name,
                              String surname,
                              String username,
                              String email,
                              String password,
                              String city) {
}
