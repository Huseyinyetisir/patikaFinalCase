package com.huseyinyetisir.WeatherApp.dto.user;

public record UserUpdateRequest(String username,
                                String email,
                                String password) {
}
