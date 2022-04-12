package com.sparta.sc.bdd.stepdefs;

import com.sparta.sc.ConnectionManager;
import com.sparta.sc.dto.WeatherDTO;
import com.sparta.sc.Injector;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class MyStepdefs {
    private WeatherDTO weatherDTO;
    private String city;
    private String lon;
    private String lat;

    @Given("I am calling the api")
    public void iAmCallingTheApi() {
        city = "london";
        lon = "-0.1257";
        lat = "51.5085";
        WeatherDTO weatherDTO;
    }

    @When("I pass the url")
    public void iPassTheUrl() {
        weatherDTO = Injector.injectDTO(ConnectionManager.getConnection(city));
    }

    @Then("I will get the longitude and latitude")
    public void iWillGetTheLongitudeAndLatitude() {
        Assertions.assertEquals(-0.1257, weatherDTO.getCoord().getLon());
        Assertions.assertEquals(51.5085, weatherDTO.getCoord().getLat());
    }

    @When("I pass the lon and lat")
    public void iPassTheLonAndLat() {
        weatherDTO = Injector.injectDTO(ConnectionManager.getConnection(lon, lat));
    }

    @Then("I will get the response")
    public void iWillGetTheResponse() {
        Assertions.assertNotEquals(null, weatherDTO);
    }

    @Given("I am testing the api")
    public void iAmTestingTheApi() {
        city = "london";
    }

    @When("I enter a specific city")
    public void iEnterASpecificCity() {
        weatherDTO = Injector.injectDTO(ConnectionManager.getConnection(city));
    }

    @Then("I will find the country it belongs to")
    public void iWillFindTheCountryItBelongsTo() {
        Assertions.assertEquals("GB", weatherDTO.getSys().getCountry());
    }

    @Then("I receive the timezone in that city")
    public void iReceiveTheTimezoneInThatCity() {
        Assertions.assertEquals(3600, weatherDTO.getTimezone());
    }
}
