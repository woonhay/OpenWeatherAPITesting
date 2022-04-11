package com.sparta.sc;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {
    private static String key = PropertiesLoader.getProperties().getProperty("key");
    private static String BASEURL = "https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=" + key;

    public static String getConnection() {
        getResponse();
        return BASEURL;
    }

    private static HttpResponse<String> getResponse() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(getConnection())).build();
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }
    public static HttpResponse<String> getConnectionResponse() {
        return getResponse();
    }
}