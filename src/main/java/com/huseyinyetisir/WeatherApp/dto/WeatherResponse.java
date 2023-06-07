package com.huseyinyetisir.WeatherApp.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherResponse(

        String cod,
        int message,
        int cnt,
        List<WeatherData> list,
        City city
) {
}
