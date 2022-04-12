package com.sparta.sc;

import com.sparta.sc.dto.WeatherDTO;
import org.junit.Assume;
import org.junit.jupiter.api.*;

import static com.sparta.sc.ConnectionManager.getConnection;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherDTOByLonLatTests {

    private WeatherDTO response;
    private String lon = "-75.4557";
    private String lat = "43.2128";

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection(lon, lat));
    }


    @Test
    @DisplayName("check response is not null")
    void checkResponseIsNotNull() {
        Assertions.assertNotNull(response);
    }

    @Test
    @DisplayName("check status is ok")
    void checkStatusIsOk() {
        Assertions.assertTrue(response.isStatusCode200());
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
    @DisplayName("Check if name weather is not empty")
    void checkIfNameWeatherIsNotEmpty() {
        Assertions.assertFalse(response.isNameWeatherEmpty());
    }

    @Test
    @DisplayName("Check weather name is not null")
    void checkWeatherNameIsNotNull() {
        Assertions.assertFalse(response.isNameNull());
    }

    @Test
    @DisplayName("Check is weather name valid from list")
    void checkIsWeatherNameValidFromList() {
        Assertions.assertTrue(response.isNameWeatherValid());
    }

    @Test
    @DisplayName("Check if description is not empty")
    void checkIfDescriptionIsNotEmpty() {
        Assertions.assertFalse(response.isDescriptionEmpty());
    }

    @Test
    @DisplayName("Check wind degrees between 0 and 360")
    void checkWindDegreesBetween0And360() {
        Assertions.assertTrue(response.isDegreeWindValid());
    }

    @Test
    @DisplayName("Converts wind speed from mph to metres per second")
    void convertsWindSpeedFromMphToMetresPerSecond() {
        assertEquals(response.getWind().getSpeed() / 2.237, response.getWindInMps());
    }

    @Test
    @DisplayName("Converts wind speed from mps to miles per hour")
    void convertsWindSpeedFromMpsToMilesPerHour() {
        assertEquals(response.getWind().getSpeed() * 2.237, response.getWindInMph());
    }

    @Test
    @DisplayName("Converts gust speed from mph to metres per second")
    void convertsGustSpeedFromMphToMetresPerSecond() {
        assertEquals(response.getWind().getGust() / 2.237, response.getGustInMps());
    }

    @Test
    @DisplayName("Converts gust speed from mps to miles per hour")
    void convertsGustSpeedFromMpsToMilesPerHour() {
        assertEquals(response.getWind().getGust() * 2.237, response.getGustInMph());
    }

    @Test
    @DisplayName("Check cloud level between 0 and 100")
    void checkCloudLevelBetween0And100() {
        // not all the calls return clouds
        Assumptions.assumeTrue(response.isCloudValid());
    }

    @Test
    @DisplayName("Check if country has two letters")
    void checkIfCountryHasTwoLetters() {
        Assertions.assertTrue(response.isCountryTwoLetters());
    }

    @Test
    @DisplayName("Check city id is greater than zero")
    void checkCityIdIsGreaterThanZero() {
        Assertions.assertTrue(response.isCityIdBiggerThanO());
    }

    @Test
    @DisplayName("Check if weather ID is between 200 and 804")
    void checkIfWeatherIdIsBetween200And804() {
        Assertions.assertTrue(response.isWeatherIDValid());
    }

    @Test
    @DisplayName("Check if weather icon file name format is valid")
    void checkIfWeatherIconFileNameFormatIsValid() {
        Assertions.assertTrue(response.isIconValid());
    }
}
