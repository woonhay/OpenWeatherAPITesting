package com.sparta.sc;

import com.sparta.sc.Injector;
import com.sparta.sc.dto.WeatherDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.sc.ConnectionManager.getConnectionCNSC;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherDTOByCityNStateCTests {

    private WeatherDTO response;
    private String cityName = "Murdochville";
    private String stateCode = "CA";

    @BeforeEach
    void setup(){
        response = Injector.injectDTO(getConnectionCNSC(cityName, stateCode));
    }

    @Test
    @DisplayName("Is city name same as entered")
    void isCityNameSameAsEntered() {
        Assertions.assertTrue(response.isSameCity(cityName));
    }

    @Test
    @DisplayName("Is state code same as entered")
    void isStateCodeSameAsEntered() {
        Assertions.assertTrue(response.isSameStateCode(stateCode));
    }

}
