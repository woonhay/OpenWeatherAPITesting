package com.sparta.sc.utilities;

public class TemperatureConverter {

    public static double CovertCelsiusToFahreinheit(double celsius){
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
