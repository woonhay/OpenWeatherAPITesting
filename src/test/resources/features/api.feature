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
    Given I am calling the api
    When I enter a specific city
    Then I will find the country it belongs to

  Scenario: find the timezone of a city
    Given I am calling the api
    When I enter a specific city
    Then I receive the timezone in that city

  Scenario: check the weather id is valid or not
    Given I input the city
    When I get the response
    Then I will see the valid weather id

  Scenario: check the main must match the corresponding id in weather conditions codes
    Given I input the city
    When I get the response
    Then I will see the weather main

  Scenario: check the description must match the corresponding id in weather conditions codes
    Given I input the city
    When I get the response
    Then I will see the weather description

  Scenario: check the icon must match the corresponding id in weather conditions codes
    Given I input the city
    When I get the response
    Then I will see the weather icon

  Scenario: check degree wind valid
    Given I input the city
    When I get the response
    Then I will see the valid degree wind

  Scenario: check cloud valid
    Given I input the city
    When I get the response
    Then I will see the valid cloud

  Scenario: check country is two letters
    Given I input the city
    When I get the response
    Then I will see the country with two letters

  Scenario: check status code equals 200
    Given I input the city
    When I get the response
    Then I will see the status code

  Scenario: check city ID bigger then 0
    Given I input the city
    When I get the response
    Then I will see the city ID



#  Scenario: get a list of cities
#    Given I am testing the api
#    When I enter the country
#    Then I will get a list of cities

#  Scenario: choose the language
#    Given I am calling the api
#    When I choose the language
#    Then I can read the information easily

#  Scenario: input city id
#    Given I am calling the api
#    When I input the city id
#    Then I can select the correct location
#
#  Scenario: input zip code
#    Given I am calling the api
#    When I input the zip code
#    Then I can select the correct location