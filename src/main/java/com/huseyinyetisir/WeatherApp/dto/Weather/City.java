package com.huseyinyetisir.WeatherApp.dto.Weather;

public record City(
        String name,
        Coord coord,
        String country
){
}
