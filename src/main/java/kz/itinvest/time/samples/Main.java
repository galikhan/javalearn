package kz.itinvest.time.samples;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalField;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime newLocalDateTime = localDateTime.withHour(16).withMinute(39);
        System.out.println("new local " + newLocalDateTime.toString());

        System.out.println("instant seconds 1 = " + localDateTime.get(ChronoField.AMPM_OF_DAY));
        System.out.println("instant seconds 2 = " + localDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("instant seconds 3 = " + localDateTime.get(ChronoField.DAY_OF_YEAR));
        System.out.println("instant seconds 4 = " + localDateTime.get(ChronoField.ERA));
        System.out.println("instant seconds 5 = " + localDateTime.getLong(ChronoField.EPOCH_DAY));
//        System.out.println("instant seconds 6 = " + localDateTime.getLong(ChronoField.INSTANT_SECONDS));
        Instant instant = Instant.now();

        Instant localInstant = localDateTime.toInstant(ZoneOffset.ofHours(0));
        Instant newLocalInstant = localDateTime.toInstant(ZoneOffset.ofHours(0));
        Duration duration = Duration.between(localDateTime, newLocalDateTime);
        System.out.println("local date converted to instant  = " + localInstant);

        long durationSeconds = duration.getSeconds();
//        System.out.println("duration between seconds  = " + duration.getSeconds());

        long dayInSeconds = 60*60*24;
        if(durationSeconds < 0) {
            System.out.println("next day seconds = " + (dayInSeconds + duration.getSeconds()));
        } else {
//            System.out.println("duration between seconds  = " + durationSeconds);
//            System.out.println("duration between seconds  = " + duration.);
        }

    }
}
