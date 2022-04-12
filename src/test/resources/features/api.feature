Feature: Collect the correct data from the API

  Scenario: check status code equals 200
    Given I input the city
    When I get the response
    Then I will see the status code

  Scenario: Check base is station
    Given I input the city
    When I get the response
    Then I will see the base is station

  Scenario: Check longitude is Between minus 180 and 180
    Given I input the city
    When I get the response
    Then I will see the valid longitude

  Scenario: Check latitude is Between minus 90 and 90
    Given I input the city
    When I get the response
    Then I will see the valid latitude

  Scenario: Check if name weather is not empty
    Given I input the city
    When I get the response
    Then I will see the name weather which is not empty

  Scenario: Check is weather name valid from list
    Given I input the city
    When I get the response
    Then I will see the valid weather name

  Scenario: Check if description is empty
    Given I input the city
    When I get the response
    Then I will see the description which is not empty

  Scenario: check degree wind valid
    Given I input the city
    When I get the response
    Then I will see the valid degree wind

  Scenario: Converts wind speed from mph to meters per second

  Scenario: Converts wind speed from mps to miles per hour

  Scenario: Converts gust speed from mph to meters per second

  Scenario: Converts gust speed from mps to miles per hour

  Scenario: check cloud valid
    Given I input the city
    When I get the response
    Then I will see the valid cloud

  Scenario: Check rain valid with level 1hr between 0 and 320 and 3hr between 0 and 1000
    Given I input the city
    When I get the response
    Then I will see the valid rain

  Scenario: Check if weather name exists
    Given I input the city
    When I get the response
    Then I will see the weather name exists

  Scenario: Check weather name is not null
    Given I input the city
    When I get the response
    Then I will see the weather name which is not null

  Scenario: check country is two letters
    Given I input the city
    When I get the response
    Then I will see the country with two letters

  Scenario: check city ID bigger then 0
    Given I input the city
    When I get the response
    Then I will see the city ID

  Scenario: Check if weather ID is between 200 and 804
    Given I input the city
    When I get the response
    Then I will see the valid weather ID

  Scenario: Check if weather icon file name format is valid
    Given I input the city
    When I get the response
    Then I will see the weather icon file name with valid format

  Scenario: Check pressure between 870 and 1085
    Given I input the city
    When I get the response
    Then I will see the valid pressure

  Scenario: Check is humidity is valid between 0 and 100
    Given I input the city
    When I get the response
    Then I will see the valid humidity

  Scenario: Check visibility is between 0 and 100
    Given I input the city
    When I get the response
    Then I will see the valid visibility

  Scenario: Check if kelvin temperature is between 199 and 330
    Given I input the city
    When I get the response
    Then I will see the valid kelvin

  Scenario: Check Celsius temperature is valid
    Given I input the city
    When I get the response
    Then I will see the valid Celsius

  Scenario: Check Fahrenheit temperature is valid
    Given I input the city
    When I get the response
    Then I will see the valid Fahrenheit

  Scenario: Check if weather results received today
    Given I input the city
    When I get the response
    Then I will see today date

  Scenario: Check if sunrise data is for today
    Given I input the city
    When I get the response
    Then I will see sunrise with today date

  Scenario: Check if sunset data is for today
    Given I input the city
    When I get the response
    Then I will see the sunset with today date

  Scenario: Check if time zone ranges between minus 12h and plus 14h from UTC
    Given I input the city
    When I get the response
    Then I will see the time zone

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