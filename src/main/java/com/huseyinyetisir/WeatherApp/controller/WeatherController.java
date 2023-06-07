package com.huseyinyetisir.WeatherApp.controller;


import com.huseyinyetisir.WeatherApp.dto.WeatherResponse;
import com.huseyinyetisir.WeatherApp.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public WeatherResponse getWeatherByCity(@PathVariable String city){
        return weatherService.getWeatherByCityFromApi(city);
    }
}
