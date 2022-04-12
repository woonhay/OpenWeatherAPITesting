package com.sparta.sc.utilities;

public class TemperatureConverter {

    public static double CovertCelsiusToFahreinheit(double celsius){
        double cel = celsius;
        double fahreinheit = 0;
        fahreinheit = (cel * 9 / 5) + 32;

        return fahreinheit;
    }

    public static double CovertCelsiusToKelvin(double celsius){
        double cel = celsius;
        double kelvin = celsius + 273.15;

        return kelvin;
    }

    public static double CovertFahreinheitToCelsius(double fahreinheit){
        double fah = fahreinheit;
        double celsius = 0;
        celsius = (fahreinheit - 32) * 5 / 9 ;

        return celsius;
    }


    public static double ConvertFahreinheitToKelvin(double fahreinheit){
        double fah = fahreinheit;
        double kelvin = 0;
        kelvin = (fah - 32) * 5 / 9 + 273.15 ;
        return kelvin;
    }

    public static double ConvertKelvinToCelsius(double kelvin){
        double Celsius = kelvin - 273.15;
        return Celsius;
    }

}
