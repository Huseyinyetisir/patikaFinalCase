package com.huseyinyetisir.WeatherApp.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huseyinyetisir.WeatherApp.dto.WeatherResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private static final String API_URL = "https://api.openweathermap.org/data/2.5/forecast?units=metric&appid=ee580852189ba8bd9a6ce1f90fd01592&q=";

    private final RestTemplate restTemplate;

    private final ObjectMapper objectMapper;

    public WeatherService(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }


    public WeatherResponse getWeatherByCityFromApi(String city){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(API_URL+city,String.class);

        try {
            WeatherResponse weatherResponse = objectMapper.readValue(responseEntity.getBody(), WeatherResponse.class);
            return weatherResponse;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }



}
