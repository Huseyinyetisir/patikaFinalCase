package com.huseyinyetisir.WeatherApp.controller;

import com.huseyinyetisir.WeatherApp.dto.Weather.WeatherResponse;
import com.huseyinyetisir.WeatherApp.service.WeatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WeatherController.class)
public class WeatherControllerTest {

    private MockMvc mockMvc;

    @Mock
    private WeatherService weatherService;

    @Autowired
    private WeatherController weatherController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(weatherController).build();
    }

    public WeatherControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetWeatherByCity() throws Exception {
        WeatherResponse weatherResponse = new WeatherResponse("Sunny", 25,12,null,null);
        when(weatherService.getWeatherByCityFromApi(anyString())).thenReturn(weatherResponse);
        ResultActions resultActions = mockMvc.perform(get("/v1/api/weather/London"));
        resultActions.andExpect(status().isOk());
    }
}