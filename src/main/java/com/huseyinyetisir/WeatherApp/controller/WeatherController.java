package com.huseyinyetisir.WeatherApp.controller;



import com.huseyinyetisir.WeatherApp.dto.Weather.WeatherResponse;
import com.huseyinyetisir.WeatherApp.service.WeatherService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/weather")
@Tag(name = "Open Weather Map Service API v1", description = "Open Weather Map Service API to search the 5 day forecast with a 3-hour step weather report of the city")
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
