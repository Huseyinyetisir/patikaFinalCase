package com.huseyinyetisir.WeatherApp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MainData(
        Double temp,
        @JsonProperty("feels_like")
        Integer feelsLike,
        Integer humidity,
        Integer pressure
) {
}
