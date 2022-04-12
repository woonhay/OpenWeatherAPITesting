package com.sparta.sc.utilities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class TimeConverter {

    public static LocalDate epochToLocalDate(int time){
        return LocalDate.ofInstant(Instant.ofEpochSecond(time), ZoneId.of("GMT"));
    }

    public static long localDateToEpoch(LocalDate localDate){
        return localDate.toEpochDay();
    }
}
