package com.sparta.sc.DTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sparta.sc.utilities.SpeedConverter;

public class WeatherDTO{

	private static List<WeatherConditionDTO> weatherConditionDTOList = new ArrayList<>();

	@JsonProperty("visibility")
	private int visibility;

	@JsonProperty("timezone")
	private int timezone;

	@JsonProperty("main")
	private Main main;

	@JsonProperty("clouds")
	private Clouds clouds;

	@JsonProperty("sys")
	private Sys sys;

	@JsonProperty("dt")
	private int dt;

	@JsonProperty("coord")
	private Coord coord;

	@JsonProperty("weather")
	private List<WeatherItem> weather;

	@JsonProperty("name")
	private String name;

	@JsonProperty("cod")
	private int cod;

	@JsonProperty("id")
	private int id;

	@JsonProperty("base")
	private String base;

	@JsonProperty("wind")
	private Wind wind;

	public int getVisibility(){
		return visibility;
	}

	public int getTimezone(){
		return timezone;
	}

	public Main getMain(){
		return main;
	}

	public Clouds getClouds(){
		return clouds;
	}

	public Sys getSys(){
		return sys;
	}

	public int getDt(){
		return dt;
	}

	public Coord getCoord(){
		return coord;
	}

	public List<WeatherItem> getWeather(){
		return weather;
	}

	public String getName(){
		return name;
	}

	public int getCod(){
		return cod;
	}

	public int getId(){
		return id;
	}

	public String getBase(){
		return base;
	}

	public Wind getWind(){
		return wind;
	}

	//Ryan
	public boolean checkIDValid() {
		return WeatherConditionCodes.getWeatherConditionStream().anyMatch(weatherCondition -> weatherCondition.getId() == getWeather().get(0).getId());
	}

	public boolean checkMainMatchTheID() {
		boolean isMatch = false;
		weatherConditionDTOList = WeatherConditionCodes.getWeatherCondition();
		for (int i = 0; i < weatherConditionDTOList.size(); i ++) {
			if (weatherConditionDTOList.get(i).getId() == getWeather().get(0).getId()) {
				if (weatherConditionDTOList.get(i).getMain() == getWeather().get(0).getMain()) {
					isMatch = true;
				}
			}
		}
		return isMatch;
	}

	public boolean checkDescriptionMatchTheID() {
		boolean isMatch = false;
		weatherConditionDTOList = WeatherConditionCodes.getWeatherCondition();
		for (int i = 0; i < weatherConditionDTOList.size(); i ++) {
			if (weatherConditionDTOList.get(i).getId() == getWeather().get(0).getId()) {
				if (weatherConditionDTOList.get(i).getDescription() == getWeather().get(0).getDescription()) {
					isMatch = true;
				}
			}
		}
		return isMatch;
	}

	public boolean checkIconMatchTheID() {
		boolean isMatch = false;
		weatherConditionDTOList = WeatherConditionCodes.getWeatherCondition();
		for (int i = 0; i < weatherConditionDTOList.size(); i ++) {
			if (weatherConditionDTOList.get(i).getId() == getWeather().get(0).getId()) {
				if (weatherConditionDTOList.get(i).getIcon().length == 1) {
					if (weatherConditionDTOList.get(i).getIcon()[0] == getWeather().get(0).getDescription()) {
						isMatch = true;
					}
				}
				else {
					if (weatherConditionDTOList.get(i).getIcon()[0] == getWeather().get(0).getDescription() || weatherConditionDTOList.get(i).getIcon()[1] == getWeather().get(0).getDescription()) {
						isMatch = true;
					}
				}
			}
		}
		return isMatch;
	}

	//SimWeatherDTO
	// check if the lon is the same we passed as a parameter
	public boolean isSameLon(double lon) {
		return lon == getCoord().getLon();
	}

	// check if the lat is the same we passed as a parameter
	public boolean isSameLat(double lat) {
		return lat == getCoord().getLat();
	}

	public boolean isLonValid() {
		return getCoord().getLon() >= -180 && getCoord().getLon() <= 180;
	}

	public boolean isLatValid() {
		return getCoord().getLon() >= -90 && getCoord().getLon() <= 90;
	}

	public boolean isNameWeatherEmpty() {
		return getWeather().get(0).getMain().equals("");
	}

	public boolean isDescriptionEmpty() {
		return getWeather().get(0).getDescription().equals("");
	}

	public boolean isDegreeWindValid() {
		return getWind().getDeg() >= 0 && getWind().getDeg() <= 360;
	}

	public double getWindInMps() {
		return SpeedConverter.mphToMps(getWind().getSpeed());
	}

	public double getWindInMph() {
		return SpeedConverter.mpsToMph(getWind().getSpeed());
	}

	public double getGustInMps() {
		return SpeedConverter.mphToMps(getWind().getGust());
	}

	public double getGustInMph() {
		return SpeedConverter.mpsToMph(getWind().getGust());
	}

	public boolean isCloudValid() {
		return getClouds().getAll() >= 0 && getClouds().getAll() <= 100;
	}

	public boolean isNameEmpty() {
		return getName().equals("");
	}

	public boolean isNameNull() {
		return getName() == null;
	}

	public boolean isCountryTwoLetters() {
		return getSys().getCountry().matches("[A-Za-z]{2}");
	}

	public boolean isStatusCode200() {
		return getCod() == 200;
	}

	public boolean isIdBiggerThanO() {
		return getId() > 0;
	}

	//WeatherDTOM
	public boolean isPressureValid(int val){
		return val <= 870 && val <= 1085;
	}

	public boolean isHumidityValid(int val){
		return val >= 0 && val <= 100;
	}

	public boolean IsVisibilityValid(int vis){
		return vis >= 0 && vis <= 100;
	}

	public boolean IsCelisusValid(double celsius){
		double cel = celsius;
		return cel >=-74 && cel<=56.7;
	}

	public boolean IsFahreinheitValid(double fahreinheit){
		double fah = fahreinheit;
		return fah >= -101.2 && fah <= 135;
	}

	public boolean IsKelvinValid(double kelvin){
		double kel = kelvin;
		return kel >=0 && kel <=178;

	}

	public double CovertCelsiusToFahreinheit(double celsius){
		double cel = celsius;
		double fahreinheit = 0;
		fahreinheit = (cel * 9 / 5) + 32;

		return fahreinheit;
	}
	public double CovertFahreinheitToCelsius(double fahreinheit){
		double fah = fahreinheit;
		double celsius = 0;
		celsius = (fahreinheit - 32) * 5 / 9 ;

		return celsius;
	}
	public double CovertCelsiusToKelvin(double celsius){
		double cel = celsius;
		double kelvin = celsius + 273.15;

		return kelvin;
	}
}