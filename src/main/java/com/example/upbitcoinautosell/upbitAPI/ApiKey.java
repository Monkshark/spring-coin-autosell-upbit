package com.example.upbitcoinautosell.upbitAPI;

import lombok.Getter;

@Getter
public class ApiKey {
    private static final String ACCESS_KEY = "";
    private static final String SECRET_KEY = "";

    public static String getAccessKey() {
        return ACCESS_KEY;
    }

    public static String getSecretKey() {
        return SECRET_KEY;
    }
}

