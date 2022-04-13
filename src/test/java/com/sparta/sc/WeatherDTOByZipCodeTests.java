package com.sparta.sc;

import com.sparta.sc.dto.WeatherDTO;
import org.junit.jupiter.api.BeforeEach;


import static com.sparta.sc.ConnectionManager.getConnection;

public class WeatherDTOByZipCodeTests {

    WeatherDTO response;
    int Zip = 94040;
    String CountryCode = "us";

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection(Zip, CountryCode));
    }

}
