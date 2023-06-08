package com.huseyinyetisir.WeatherApp.dto.user;

public record UserUpdatePasswordRequest(
                                String email,
                                String password) {
}
