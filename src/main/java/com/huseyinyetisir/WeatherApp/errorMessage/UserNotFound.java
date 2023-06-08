package com.huseyinyetisir.WeatherApp.errorMessage;

import com.huseyinyetisir.WeatherApp.general.BaseErrorMessage;

public enum UserNotFound implements BaseErrorMessage {

    USER_NOT_FOUND("User Not Found!!");

    public String message;

    UserNotFound(String message) {
        this.message =message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }


}
