package com.huseyinyetisir.WeatherApp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huseyinyetisir.WeatherApp.general.RestResponse;
import org.springframework.test.web.servlet.MvcResult;

import java.io.UnsupportedEncodingException;

public class BaseTest {
    protected ObjectMapper objectMapper;

    protected boolean isSuccess(MvcResult mvcResult) throws JsonProcessingException, UnsupportedEncodingException {
        var restResponse = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), RestResponse.class);

        boolean success = restResponse.isSuccess();
        return success;
    }
}
