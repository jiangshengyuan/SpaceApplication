package com.topdot.account.infrastructure.util;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {

    public static String generateTime(){
        return LocalDateTime.now(Clock.systemDefaultZone()).format(DateTimeFormatter.ISO_DATE_TIME);
    }
    public static String generateDate(){
        return LocalDateTime.now(Clock.systemDefaultZone()).format(DateTimeFormatter.ISO_DATE);
    }

}
