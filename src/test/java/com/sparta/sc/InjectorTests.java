package com.sparta.sc;

import com.sparta.sc.dto.WeatherDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InjectorTests {
    private HttpResponse response;
    private WeatherDTO weatherDTO;

    private final static String bodyResponse =
            "{\n" +
                    "    \"coord\": {\n" +
                    "        \"lon\": 139,\n" +
                    "        \"lat\": 35\n" +
                    "    },\n" +
                    "    \"weather\": [\n" +
                    "        {\n" +
                    "            \"id\": 800,\n" +
                    "            \"main\": \"Clear\",\n" +
                    "            \"description\": \"clear sky\",\n" +
                    "            \"icon\": \"01n\"\n" +
                    "        }\n" +
                    "    ],\n" +
                    "    \"base\": \"stations\",\n" +
                    "    \"main\": {\n" +
                    "        \"temp\": 290.55,\n" +
                    "        \"feels_like\": 290.3,\n" +
                    "        \"temp_min\": 290.55,\n" +
                    "        \"temp_max\": 290.55,\n" +
                    "        \"pressure\": 1010,\n" +
                    "        \"humidity\": 75\n" +
                    "    },\n" +
                    "    \"visibility\": 10000,\n" +
                    "    \"wind\": {\n" +
                    "        \"speed\": 0.45,\n" +
                    "        \"deg\": 232,\n" +
                    "        \"gust\": 0.89\n" +
                    "    },\n" +
                    "    \"clouds\": {\n" +
                    "        \"all\": 0\n" +
                    "    },\n" +
                    "    \"dt\": 1649755939,\n" +
                    "    \"sys\": {\n" +
                    "        \"type\": 2,\n" +
                    "        \"id\": 2019346,\n" +
                    "        \"country\": \"JP\",\n" +
                    "        \"sunrise\": 1649708189,\n" +
                    "        \"sunset\": 1649754775\n" +
                    "    },\n" +
                    "    \"timezone\": 32400,\n" +
                    "    \"id\": 1851632,\n" +
                    "    \"name\": \"Shuzenji\",\n" +
                    "    \"cod\": 200\n" +
                    "}";

    @BeforeEach
    void setup() {
        response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.body()).thenReturn(bodyResponse);
        weatherDTO = Injector.injectDTO(response);
    }

    @Test
    @DisplayName("Test WeatherDTO is not null")
    void testWeatherDtoIsNotNull() {
        Assertions.assertNotEquals(null, weatherDTO);
        Mockito.verify(response, Mockito.times(1)).body();
    }

    @Test
    @DisplayName("Test WeatherDTO returns correct coord")
    void testWeatherDtoReturnsCorrectCoord() {
        Assertions.assertEquals(139, weatherDTO.getCoord().getLon());
        Assertions.assertEquals(35, weatherDTO.getCoord().getLat());
        Mockito.verify(response, Mockito.times(1)).body();
    }
}
