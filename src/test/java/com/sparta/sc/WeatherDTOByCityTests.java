package com.sparta.sc;

import com.sparta.sc.dto.WeatherDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.sc.ConnectionManager.getConnection;

public class WeatherDTOByCityTests {

    WeatherDTO response;
    String city = "London";

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection("London"));
    }

    @Test
    @DisplayName("Check city is same as entered")
    void checkCityIsSameAsEntered() {
        Assertions.assertTrue(response.isSameCity(city));
    }
}
