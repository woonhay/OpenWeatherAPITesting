package com.sparta.sc.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sparta.sc.utilities.TimeConverter;

import java.time.LocalDate;
import java.util.List;

public class WeatherDTOSim2 {

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

    public boolean isDateToday(){
        return LocalDate.now().equals(TimeConverter.epochToLocalDate(getDt()));
    }
    public boolean isSunriseToday(){
        return LocalDate.now().equals(TimeConverter.epochToLocalDate(getSys().getSunrise()));
    }
    public boolean isSunsetToday(){
        return LocalDate.now().equals(TimeConverter.epochToLocalDate(getSys().getSunset()));
    }

    public boolean isTimezoneInRange(){
        // timezone range goes form -12h to +14h
        // -12h = -43200sec
        // +14h = 50400sec
        return getTimezone() >= -43200 && getTimezone() <= 50400;
    }
}
