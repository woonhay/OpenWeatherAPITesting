package com.sparta.sc.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherDTOM {

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

	public boolean isWeatherIDValid(){
		return getWeather().get(0).getId() >= 200 && getWeather().get(0).getId() <= 804;
	}

	public boolean isIconValid(){
		return getWeather().get(0).getIcon().matches("\\d{2}[d|n][.][p][n][g]");
	}


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