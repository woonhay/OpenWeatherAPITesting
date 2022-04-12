package com.sparta.sc;

import com.sparta.sc.dto.WeatherDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.http.HttpResponse;

import static com.sparta.sc.ConnectionManager.getConnection;

public class RyanDTOTest {

    WeatherDTO response;


    @BeforeEach
    void setup() {
        HttpResponse connection = getConnection("London");
        response = Injector.injectDTO(connection);
    }

    @Test
    @DisplayName("check id is in the weather condition id list")
    void checkIDIsValid() {
        Assertions.assertTrue(response.checkIDValid());
    }

    @Test
    @DisplayName("check the main must match the corresponding ID in weather condition codes")
    void checkMainMatchCorrespondingID() {
        Assertions.assertTrue(response.checkMainMatchTheID());
    }

    @Test
    @DisplayName("check the description must match the corresponding ID in weather condition codes")
    void checkDescriptionMatchCorrespondingID() {
        Assertions.assertTrue(response.checkDescriptionMatchTheID());
    }

    @Test
    @DisplayName("check the icon must match the corresponding ID in weather condition codes")
    void checkIconMatchCorrespondingID() {
        Assertions.assertTrue(response.checkIconMatchTheID());
    }
}
