package com.sparta.sc.utilities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class TimeConverter {

    public static LocalDate epochToLocalDate(int time){
        return LocalDate.ofInstant(Instant.ofEpochSecond(time), ZoneId.systemDefault());
    }

    public static long localDateToEpoch(LocalDate localDate){
        return localDate.toEpochDay();
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
    }

}
