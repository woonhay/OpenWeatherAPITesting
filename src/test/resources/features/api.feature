Feature: Collect the correct data from the API

  Scenario: get a longitude and latitude
    Given I am calling the api
    When I pass the url
    Then I will get the longitude and latitude

  Scenario: get a response
    Given I am calling the api
    When I pass the lon and lat
    Then I will get the response

  Scenario: find the country it belongs to
    Given I am testing the api
    When I enter a specific city
    Then I will find the country it belongs to

  Scenario: get a list of cities
    Given I am testing the api
    When I enter the country
    Then I will get a list of cities

  Scenario: get the correct information
    Given I am making an api call
    When I pass the parameters
    Then I will get the correct information

  Scenario: choose the language
    Given I am calling the api
    When I choose the language
    Then I can read the information easily

  Scenario: input city id
    Given I am calling the api
    When I input the city id
    Then I can select the correct location

  Scenario: input zip code
    Given I am calling the api
    When I input the zip code
    Then I can select the correct location