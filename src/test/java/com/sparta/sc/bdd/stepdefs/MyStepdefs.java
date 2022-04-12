package com.sparta.sc.bdd.stepdefs;

import com.sparta.sc.ConnectionManager;
import com.sparta.sc.dto.WeatherDTO;
import com.sparta.sc.Injector;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.net.http.HttpResponse;


public class MyStepdefs {
    private WeatherDTO weatherDTO;
    HttpResponse connection;
    HttpResponse connection2;

    @Given("I am calling the api")
    public void iAmCallingTheApi() {
        connection = ConnectionManager.getConnection("london");
        connection2 = ConnectionManager.getConnection("-0.1257", "51.5085");
    }

    @When("I pass the url")
    public void iPassTheUrl() {
        weatherDTO = Injector.injectDTO(connection);
    }

    @Then("I will get the longitude and latitude")
    public void iWillGetTheLongitudeAndLatitude() {
        Assertions.assertEquals(-0.1257, weatherDTO.getCoord().getLon());
        Assertions.assertEquals(51.5085, weatherDTO.getCoord().getLat());
    }

    @When("I pass the lon and lat")
    public void iPassTheLonAndLat() {
        weatherDTO = Injector.injectDTO(connection2);
    }

    @Then("I will get the response")
    public void iWillGetTheResponse() {
        Assertions.assertNotEquals(null, weatherDTO);
    }

    @When("I enter a specific city")
    public void iEnterASpecificCity() {
        weatherDTO = Injector.injectDTO(connection);
    }

    @Then("I will find the country it belongs to")
    public void iWillFindTheCountryItBelongsTo() {
        Assertions.assertEquals("GB", weatherDTO.getSys().getCountry());
    }

    @Then("I receive the timezone in that city")
    public void iReceiveTheTimezoneInThatCity() {
        Assertions.assertEquals(3600, weatherDTO.getTimezone());
    }

    @Given("I input the city")
    public void iInputTheCity() {
        connection = ConnectionManager.getConnection("london");
    }

    @When("I get the response")
    public void iGetTheResponse() {
        weatherDTO = Injector.injectDTO(connection);
    }

    @Then("I will see the valid weather id")
    public void iWillSeeTheValidWeatherId() {
        Assertions.assertTrue(weatherDTO.checkIDValid());
    }

    @Then("I will see the weather main")
    public void iWillSeeTheWeatherMain() {
//        Assertions.assertTrue(weatherDTO.checkIDValid());
    }

    @Then("I will see the weather description")
    public void iWillSeeTheWeatherDescription() {
//        Assertions.assertTrue(weatherDTO.checkIDValid());
    }

    @Then("I will see the weather icon")
    public void iWillSeeTheWeatherIcon() {
//        Assertions.assertTrue(weatherDTO.checkIDValid());
    }

    @Then("I will see the valid degree wind")
    public void iWillSeeTheValidDegreeWind() {
//        Assertions.assertTrue(weatherDTO.checkIDValid());
    }

    @Then("I will see the valid cloud")
    public void iWillSeeTheValidCloud() {
//        Assertions.assertTrue(weatherDTO.checkIDValid());
    }
}
