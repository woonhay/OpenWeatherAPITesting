package com.sparta.sc;

import com.sparta.sc.Injector;
import com.sparta.sc.dto.WeatherDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.sparta.sc.ConnectionManager.getConnectionCNSCCC;

public class WeatherDTOByCityNStateCTests {

    private WeatherDTO response;
    private String cityName = "Henderson";
    private String stateCode = "TX";
    private String countryCode = "US";

    @BeforeEach
    void setup(){
        response = Injector.injectDTO(getConnectionCNSCCC(cityName, stateCode, countryCode));
    }

    @Test
    @DisplayName("Is city name same as entered")
    void isCityNameSameAsEntered() {
        Assertions.assertTrue(response.isSameCity(cityName));
    }

    @Test
    @DisplayName("Is country code same as entered")
    void isCountryCodeSameAsEntered() {
        Assertions.assertTrue(response.isSameCountryCode());
    }

}
