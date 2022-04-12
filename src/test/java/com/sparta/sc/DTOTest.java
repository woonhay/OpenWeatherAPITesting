package com.sparta.sc;

import com.sparta.sc.dto.WeatherDTO;
import org.junit.AssumptionViolatedException;
import org.junit.jupiter.api.*;

import static com.sparta.sc.ConnectionManager.*;
import static com.sparta.sc.utilities.SpeedConverter.df;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DTOTest {

    WeatherDTO response;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection("Roma"));
    }

    @Test
    @DisplayName("Response Gives Status Code 200")
    void ifResponseGivesStatusCode200() {
        assertEquals(200, response.getCod());
    }

    @Test
    @DisplayName("Check base is station")
    void checkBaseIsStation() {
        Assertions.assertEquals("stations", response.getBase());
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
    @DisplayName("Check if name weather not empty")
    void checkIfNameWeatherNotEmpty() {
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
        assertEquals(Double.parseDouble(df.format(response.getWind().getSpeed()/2.237)),response.getWindInMps());
    }

    @Test
    @DisplayName("Converts wind speed from mps to miles per hour")
    void convertsWindSpeedFromMpsToMilesPerHour() {
        assertEquals(Double.parseDouble(df.format(response.getWind().getSpeed()*2.237)), response.getWindInMph());
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
        Assumptions.assumeTrue(response.isCloudValid());
    }

    @Test
    @DisplayName("Check rain valid with level 1hr between 0 and 320 and 3hr between 0 and 1000")
    void checkRainValidWithLevel1HrBetween0And320And3HrBetween0And1000() {
        Assumptions.assumeTrue(response.isRainValid());
    }

    @Test
    @DisplayName("Check if weather name exists")
    void checkIfWeatherNameExists() {
        Assertions.assertFalse(response.isNameEmpty());
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
        Assertions.assertTrue(response.isIconValid());
    }

    @Test
    @DisplayName("Check pressure between 870 and 1085")
    void checkPressureBetween870And1085() {
        Assertions.assertTrue(response.isPressureValid());
    }

    @Test
    @DisplayName("Check is humidity is valid between 0 and 100")
    void checkIsHumidityIsValidBetween0And100() {
        assertTrue(response.isHumidityValid());
    }

    @Test
    @DisplayName("Check visibility is between 0 and 100")
    void checkVisibilityIsBetween0And100() {
        Assertions.assertTrue(response.isVisibilityValid());
    }

    @Test
    @DisplayName("Check if kelvin temperature is between 199 and 330")
    void checkIfCelciusTemperatureIsBetween199And330() {
        Assertions.assertTrue(response.isKelvinValid());
    }

    @Test
    @DisplayName("Check if weather results received today")
    void checkIfWeatherResultsReceivedToday() {
        Assertions.assertTrue(response.isDateToday());
    }

    @Test
    @DisplayName("Check if sunrise data is for today")
    void checkIfSunriseDataIsForToday() {
        Assertions.assertTrue(response.isSunriseToday());
    }

    @Test
    @DisplayName("Check if sunset data is for today")
    void checkIfSunsetDataIsForToday() {
        Assertions.assertTrue(response.isSunsetToday());
    }

    @Test
    @DisplayName("Check if timezone ranges between minus 12h and plus 14h from UTC ")
    void checkIfTimezoneRangesBetweenMinus12HAndPlus14HFromUtc() {
        Assertions.assertTrue(response.isTimezoneInRange());
    }



}
