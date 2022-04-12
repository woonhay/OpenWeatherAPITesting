package com.sparta.sc.bdd.stepdefs;

import com.sparta.sc.DTO.WeatherDTO;
import com.sparta.sc.Injector;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.sparta.sc.ConnectionManager.getConnection;

public class MyStepdefs {
    public WeatherDTO response;

    @Before
    public void setup() {
        response = Injector.injectDTO(getConnection("London"));
    }

    @Given("I am calling the api")
    public void iAmCallingTheApi() {

    }

    @When("I pass the url")
    public void iPassTheUrl() {

    }

    @Then("I will get the longitude and latitude")
    public void iWillGetTheLongitudeAndLatitude() {

    }

    @When("I pass the lon and lat")
    public void iPassTheLonAndLat() {
    }

    @Then("I will get the response")
    public void iWillGetTheResponse() {
    }

    @Given("I am testing the api")
    public void iAmTestingTheApi() {
    }

    @When("I enter a specific city")
    public void iEnterASpecificCity() {
    }

    @Then("I will find the country it belongs to")
    public void iWillFindTheCountryItBelongsTo() {
    }

    @When("I enter the country")
    public void iEnterTheCountry() {
    }

    @Then("I will get a list of cities")
    public void iWillGetAListOfCities() {
    }

    @Given("I am making an api call")
    public void iAmMakingAnApiCall() {
    }

    @When("I pass the parameters")
    public void iPassTheParameters() {
    }

    @Then("I will get the correct information")
    public void iWillGetTheCorrectInformation() {
    }

    @When("I choose the language")
    public void iChooseTheLanguage() {
    }

    @Then("I can read the information easily")
    public void iCanReadTheInformationEasily() {
    }

    @When("I input the city id")
    public void iInputTheCityId() {
    }

    @Then("I can select the correct location")
    public void iCanSelectTheCorrectLocation() {
    }

    @When("I input the zip code")
    public void iInputTheZipCode() {
    }
}
