package com.huseyinyetisir.WeatherApp.dto;

import java.util.List;

public record WeatherData(
        long dt,
        MainData main,
        List<Weather> weather,
        Clouds clouds,
        Wind wind,
        int visibility,
        int pop,
        Sys sys,
        String dt_txt
) {
}
