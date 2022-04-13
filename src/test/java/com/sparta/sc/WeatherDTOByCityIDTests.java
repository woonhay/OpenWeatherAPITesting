package com.sparta.sc;

import com.sparta.sc.dto.WeatherDTO;
import org.junit.jupiter.api.*;
import static com.sparta.sc.ConnectionManager.getConnection;

public class WeatherDTOByCityIDTests {

    private WeatherDTO response;
    private int cityId = 2643743;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection(cityId));
    }

    @Test
    @DisplayName("Is city id same as entered")
    void isCityIdSameAsEntered() {
        Assertions.assertTrue(response.isSameCityId(cityId));
    }

}
