package com.huseyinyetisir.WeatherApp.errorMessage;

import com.huseyinyetisir.WeatherApp.general.BaseErrorMessage;

public enum MailDoesntMatchMessage implements BaseErrorMessage {

    MAIL_DOESNT_MATCH_MESSAGE("E-Mail Doesnt Match");

    private String message;
    MailDoesntMatchMessage(String message) {
        this.message = message;
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
