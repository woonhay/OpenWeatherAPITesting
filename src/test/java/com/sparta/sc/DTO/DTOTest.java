package com.sparta.sc.DTO;

import com.sparta.sc.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.sc.ConnectionManager.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DTOTest {

    WeatherDTO response;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection("London"));
    }

    @Test
    @DisplayName("Longitude is Between minus 180 and 180")
    void longitudeIsBetweenMinus180And180() {
        Assertions.assertTrue(response.isLonValid());
    }

    @Test
    @DisplayName("Longitude is Between minus 90 and 90")
    void longitudeIsBetweenMinus90And90() {
        Assertions.assertTrue(response.isLatValid());
    }

    @Test
    @DisplayName("Check if name weather empty")
    void checkIfNameWeatherEmpty() {
        Assertions.assertFalse(response.isNameWeatherEmpty());
    }

    @Test
    @DisplayName("Check is weather name valid from list")
    void checkIsWeatherNameValidFromList() {
        Assertions.assertTrue(response.isNameWeatherValid());
    }

    @Test
    @DisplayName("Check if description is empty")
    void checkIfDescriptionIsEmpty() {
        Assertions.assertTrue(response.isDescriptionEmpty());
    }

    @Test
    @DisplayName("Check wind degrees between 0 and 360")
    void checkWindDegreesBetween0And360() {
        Assertions.assertTrue(response.isDegreeWindValid());
    }

    my

//    @Test
//    @DisplayName("if Longitude Same as Passed Longitude")
//    void ifLongitudeSameAsPassedLongitude() {
//        getConnection("139","35");
//        assertTrue(response.isSameLon());
//    }
}
