package com.sparta.sc;

import com.sparta.sc.dto.WeatherDTO;
import com.sparta.sc.utilities.SpeedConverter;
import com.sparta.sc.utilities.TemperatureConverter;
import org.junit.jupiter.api.*;

import static com.sparta.sc.ConnectionManager.getConnection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherDTOByLonLatTests {

    private WeatherDTO response;
    private String lon = "-75.4557";
    private String lat = "43.2128";

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection(lon, lat));
    }

    @Test
    @DisplayName("Is lon same as entered")
    void isLonSameAsEntered() {
        Assertions.assertTrue(response.isSameLon(lon));
    }

    @Test
    @DisplayName("Is lat same as entered")
    void isLatSameAsEntered() {
        Assertions.assertTrue(response.isSameLat(lat));
    }

}
