package com.sparta.sc;

import com.sparta.sc.dto.WeatherDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.sparta.sc.ConnectionManager.getConnection;

public class WeatherDTOByZipCodeTests {

    WeatherDTO response;
    int Zip = 94040;
    String CountryCode = "us";

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection(Zip, CountryCode));
    }


    @Test
    @DisplayName("Check Country code is same as entered")
    void checkCountryCodeIsSameAsEntered() {
        Assertions.assertTrue(response.isSameCountryCode(CountryCode));
    }

}
