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

//https://antony-can-do.tistory.com/entry/Spring-Project-%EC%BD%94%EC%9D%B8-%EC%9E%90%EB%8F%99%EB%A7%A4%EB%A7%A4-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-%EB%A7%8C%EB%93%A4%EA%B8%B0-3-%EC%97%85%EB%B9%84%ED%8A%B8-%EB%A7%A4%EC%88%98-%EB%A7%A4%EB%8F%84