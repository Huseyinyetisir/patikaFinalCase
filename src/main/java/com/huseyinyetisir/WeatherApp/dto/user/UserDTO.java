package com.huseyinyetisir.WeatherApp.dto.user;

public record UserDTO(Long id,
                      String name,
                      String surname,
                      String username,
                      String email,
                      String password) {
}
