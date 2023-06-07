package com.huseyinyetisir.WeatherApp.dto;

public record City(
        String name,
        Coord coord,
        String country
){
}
