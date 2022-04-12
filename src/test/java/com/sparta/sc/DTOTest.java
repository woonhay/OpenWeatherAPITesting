package com.sparta.sc;

import com.sparta.sc.dto.WeatherDTO;
import org.junit.jupiter.api.*;

import static com.sparta.sc.ConnectionManager.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DTOTest {

    WeatherDTO response;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection("London"));
    }

    @Test
    @DisplayName("Response Gives Status Code 200")
    void ifResponseGivesStatusCode200() {
        System.out.println(response.getCod());
        Assertions.assertTrue(response.getCod() == 200);
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
        assertEquals(response.getWind().getSpeed()/2.237,response.getWindInMps());
    }

    @Test
    @DisplayName("Converts wind speed from mps to miles per hour")
    void convertsWindSpeedFromMpsToMilesPerHour() {
        assertEquals(response.getWind().getSpeed()*2.237, response.getWindInMph());
    }

    @Test
    @DisplayName("Converts gust speed from mph to metres per second")
    void convertsGustSpeedFromMphToMetresPerSecond() {
            assertEquals(response.getWind().getGust()/2.237, response.getGustInMps());
    }

    @Test
    @DisplayName("Converts gust speed from mps to miles per hour")
    void convertsGustSpeedFromMpsToMilesPerHour() {
        assertEquals(response.getWind().getGust()*2.237, response.getGustInMph());
    }

    @Test
    @DisplayName("Check cloud level between 0 and 100")
    void checkCloudLevelBetween0And100() {
        Assertions.assertTrue(response.isCloudValid());
    }

    @Test
    @DisplayName("Check if weather name exists")
    void checkIfWeatherNameExists() {
        Assertions.assertFalse(response.isNameWeatherEmpty());
    }

    @Test
    @DisplayName("Check weather name is not null")
    void checkWeatherNameIsNotNull() {
        Assertions.assertFalse(response.isNameNull());
    }

    @Test
    @DisplayName("Check if country has two letters")
    void checkIfCountryHasTwoLetters() {
        Assertions.assertTrue(response.isCountryTwoLetters());
    }

    @Test
    @DisplayName("Check status code is 200")
    void checkStatusCodeIs200() {
        Assertions.assertTrue(response.isStatusCode200());
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
        System.out.println(response.getWeather().get(0).getIcon());
        Assertions.assertTrue(response.isIconValid());
    }

    @Test
    @DisplayName("Check is humidity is valid between 0 and 100")
    void checkIsHumidityIsValidBetween0And100() {
        //Assertions.assertTrue(isHumidityValid(response.getMain().getHumidity()));
    }

//    @Test
//    @DisplayName("Check visibility is valid number between 0 and 100")
//    void checkVisibilityIsValidNumberBetween0And100() {
//        Assertions.assertTrue(response.i);
//    }

//    @Test
//    @DisplayName("if Longitude Same as Passed Longitude")
//    void ifLongitudeSameAsPassedLongitude() {
//        getConnection("139","35");
//        assertTrue(response.isSameLon());
//    }

}
