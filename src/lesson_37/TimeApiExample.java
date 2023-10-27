package lesson_37;

import lesson_35_2023_10_24.Person;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// Created by Volodymyr Sh on 26.10.2023
// project name: AIT_Lessons
public class TimeApiExample {
    public static void main(String[] args) {

        System.out.println("================= LocalDate =================");
        // Local Date
        LocalDate date = LocalDate.now();
        System.out.println("date: " + date);
        LocalDate tomorrow = date.plusDays(1);

        System.out.println("tomorrow: " + tomorrow);
        System.out.println("date.plusDays:" + date.plusDays(1));
        System.out.println("plusWeeks: " + date.plusWeeks(4));
        System.out.println("yesterday: " + date.minusDays(1));

        LocalDate date1 = LocalDate.of(2002, 2, 15);
        System.out.println("date1: " + date1);

        System.out.println("========");

        LocalDate date2 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("год: " + date2.getYear()
                           + "; месяц: " + date2.getMonth()
                           + "; число: " + date2.getDayOfMonth()
                           + "; это была: " + date2.getDayOfWeek());

        System.out.println("день года: " +date2.getDayOfYear()
                + "; номер месяца: " + date2.getMonthValue());

        String dateString = "2000-10-25";
        LocalDate date3 = LocalDate.parse(dateString);
        System.out.println(date3.getYear() + " : " + date3.getMonth() + " : " + date3.getDayOfMonth());

        System.out.println("\n================= LocalTime =================");
        // LocalTime - представляет время (часы минуты секунды наносекунды)
        LocalTime time = LocalTime.now();
        System.out.println("time: " + time);
        LocalTime time1 = LocalTime.of(21, 33, 44, 54875);
        System.out.println("time1" + time1);
        System.out.println("time.plusMinutes: " + time.plusMinutes(65));
        System.out.println("time.minusSeconds: " + time.minusSeconds(30));
        System.out.println(time.getHour() + " | " + time.getMinute() + " | " + time.getSecond() + " | " + time.getNano());

        System.out.println("========");

        String timeString = "12:13:45";
        LocalTime parseTime = LocalTime.parse(timeString);
        System.out.println(parseTime.getHour() + " | "
                       + parseTime.getMinute() + " | "
                       + parseTime.getSecond() + " |-| " + parseTime);

        System.out.println("\n================= LocalDateTime =================");
        // LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime" + dateTime);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 31, 59);
        LocalDateTime dateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime1" + dateTime1);

        dateTime1 = LocalDateTime.of(2023, 12, 31, 23, 59);
        System.out.println("dateTime1.getDayOfWeek().getValue(): " + dateTime1.getDayOfWeek().getValue());
        System.out.println("dateTime1.plusHours: " + dateTime1.plusHours(1));

        System.out.println("\n================= ZoneDateTime =================");
        // ZoneDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime.getZone(): " + zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("\n================= isAfter, isBefore, until =================");
        LocalDate date4 = LocalDate.of(2020, 10, 15);
        LocalDate date5 = LocalDate.of(2020, 6, 25);

        // isAfter
        boolean isAfter = date4.isAfter(date5);
        System.out.println("date4.isAfter(date5): " + isAfter);

        // isBefore
        boolean isBefore = date4.isBefore(date5);
        System.out.println("date4.isBefore(date5): " + isBefore);

        // equals
        System.out.println("date4.equals(date5): " + date4.equals(date5));

        // until
        long daysBetween = date4.until(date5, ChronoUnit.DAYS);
        System.out.println("daysBetween: " + daysBetween);
        System.out.println("date4.until(date5, ChronoUnit.WEEKS): " + date4.until(date5, ChronoUnit.WEEKS));

        LocalDateTime dateTime2 = LocalDateTime.now();
        LocalDateTime dateTime3 = dateTime2.minusDays(15);
        System.out.println("dateTime2.until(dateTime3, ChronoUnit.HOURS): " + dateTime2.until(dateTime3, ChronoUnit.HOURS));

        long hoursBetween = ChronoUnit.HOURS.between(dateTime2, dateTime3);
        System.out.println("hoursBetween: " + hoursBetween);

        System.out.println("\n================= Duration =================");
        // Duration


        Instant start = Instant.now();
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j <1000 ; j++) {
                sum +=j;
            }
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        long millis = duration.toMillis();
        long seconds = duration.toSeconds();
        System.out.println("millis + \" | \" + seconds: " + millis + " | " + seconds);
        System.out.println(duration.getNano());

        System.out.println("\n================= Period =================");
        // Period
        LocalDate startDate = LocalDate.of(2022, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2023, Month.DECEMBER, 31);
        Period period = Period.between(startDate, endDate);
        System.out.println("period: " + period);
        System.out.println(period.getYears() + " | " + period.getMonths() + " | " + period.getDays());
        System.out.println("period.toTotalMonths(): " + period.toTotalMonths());

        System.out.println("\n================= DateTimeFormatter =================");
        // DateTimeFormatter
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM/dd/yyyy hh:mm:ss a");
        String formattedDate = now.format(formatter);
        System.out.println("formattedDate: " + formattedDate);

        System.out.println("========");
        String dateForParse = "23-10-26 19:15";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateForParse, formatter1);
        System.out.println("parsedDateTime: " + parsedDateTime.format(formatter));


        System.out.println("========DZ");
        String dataParse = "15-12-2022 20-46";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parsedDateTime1 = LocalDateTime.parse(dataParse, formatter2);
        System.out.println("dataParse: " + dataParse);
        System.out.println(parsedDateTime1.getYear() + " | "
                + parsedDateTime1.getMonth() + " | "
                + parsedDateTime1.getDayOfMonth()
                + " | " + parsedDateTime1.getHour());


        String dataParse2 = "13-01-2023 00-47";
        LocalDateTime parsedDateTime2 = LocalDateTime.parse(dataParse2, formatter2);
        System.out.println("dataParse1: " + dataParse2);
        System.out.println(parsedDateTime2.getYear() + " | "
                + parsedDateTime2.getMonth() + " | "
                + parsedDateTime2.getDayOfMonth()
                + " | " + parsedDateTime2.getHour());

        System.out.println(parsedDateTime2.getDayOfWeek());
        long period1 =  parsedDateTime1.until(parsedDateTime2, ChronoUnit.DAYS);
        System.out.println(period1);


        System.out.println(parsedDateTime.minus(10,ChronoUnit.DAYS));




    }



}
