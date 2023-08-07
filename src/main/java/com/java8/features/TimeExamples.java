package com.java8.features;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

public class TimeExamples {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(" Current date = "+today);

        LocalDate firstDate_2014 = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println(" Specific date = "+firstDate_2014);

        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(" Current Date in IST = "+todayKolkata);

        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println(" 365th date from base date = "+dateFromBase);

        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014,100);
        System.out.println(" 100th day of 2014 = "+hundredDay2014.format(DateTimeFormatter.BASIC_ISO_DATE));

        LocalDate parsedDate = LocalDate.parse("2015-02-28");
        System.out.println(" 100th day of 2014 - Quaerter Year = "+hundredDay2014.minus(1, IsoFields.QUARTER_YEARS).format(DateTimeFormatter.BASIC_ISO_DATE));

        System.out.println(" Parsed date = "+parsedDate.format(DateTimeFormatter.ISO_DATE));

        parsedDate = parsedDate.minusDays(2);
        System.out.println(" Menus 2 days = "+parsedDate);

        DayOfWeek aDay = LocalDate.parse("2016-06-12").getDayOfWeek();
        System.out.println(" Day of the week for 2016-06-12:"+aDay);
        System.out.println(" Is Leap Year?:" + (LocalDate.now().isLeapYear() ? "Yes" : "No"));

        boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
        System.out.println(" Is before:"+notBefore);
        boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
        System.out.println(" Is After:"+isAfter);

        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());

        System.out.println(" Begining Of Day:"+beginningOfDay+ " first Day Of Month:"+firstDayOfMonth);

        LocalTime now = LocalTime.now();

        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println(" Time: "+now );
        System.out.println(" Six Thirty: "+sixThirty);
        System.out.println(" Time : "+LocalTime.of(6,40,30,100));
        System.out.println(" Time : "+LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS));
        System.out.println(" Hour : "+LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS).getHour());
        System.out.println(" Is before 6:30 than 7:30 "+ LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30")));
        System.out.println("Local Time Second 10000 of the day  :"+LocalTime.ofSecondOfDay(10000));
        System.out.println(" Day time max : "+LocalTime.MAX+ " time min :"+LocalTime.MIN + "Time midnight:"+LocalTime.MIDNIGHT);
        System.out.println("------------------------ LocalDateTime ---------------------------");
        System.out.println(" Now: "+ LocalDateTime.now());
        System.out.println(" of :" + LocalDateTime.of(2015,Month.FEBRUARY,20,06,30,20,10));
        System.out.println(" Minus Hours:"+LocalDateTime.now().minusHours(2));
        System.out.println(" Plus Days:"+LocalDateTime.now().plusDays(1));
        System.out.println(" Get Month:"+LocalDateTime.now().getMonth());

        System.out.println("------------------------- ZoneDateTime --------------------------");
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        allZoneIds.stream().forEach(System.out::println);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(),zoneId);
        System.out.println("Zoned date time Europe: "+zonedDateTime);

        ZonedDateTime parsedZonedDateTime = ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
        System.out.println(" Parsed Zoned Date Time "+parsedZonedDateTime);
        LocalDateTime localDateTime = LocalDateTime.of(2015,Month.FEBRUARY, 20, 06 , 30);
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime,offset);
        System.out.println(" Time offset :"+offsetDateTime);

        System.out.println("------------------------- Period class in use  --------------------------");
        LocalDate initialDate = LocalDate.parse("2007-05-10").plus(Period.ofDays(1));
        LocalDate finalDate = initialDate.plus(Period.ofDays(1));
        System.out.println(" Initial date :"+ LocalDate.parse("2007-05-10") + " Final date:"+LocalDate.parse("2007-05-10").plus(Period.ofDays(1)));
        System.out.println(" Period Between : "+Period.between(initialDate, finalDate).getDays());

        System.out.println("------------------------- Duration class in use  --------------------------");
        LocalTime initialTime = LocalTime.of(6,30,0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
        System.out.println(" Initial Time:" + initialTime + " Final Time: "+finalTime );
        System.out.println(" Duration .between method :"+ Duration.between(initialTime,finalTime).getSeconds()+ " secs");
        System.out.println(" Duration ChronoUnit :"+ ChronoUnit.SECONDS.between(initialTime,finalTime));
        Date date = new Date();
        LocalDateTime backwardComp =LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDateTime backwardComp2 = LocalDateTime.ofInstant(Calendar.getInstance().toInstant(),ZoneId.systemDefault());
        System.out.println("Backward compatilibity date sample :"+backwardComp);
        System.out.println("Backward compatilibity calendar sample :"+backwardComp2);

        System.out.println("------------------------- Formatting ---------------------");
        LocalDateTime localDateTime1 = LocalDateTime.of(2015,Month.JANUARY,25,6,30);
        String localDateString = localDateTime1.format(DateTimeFormatter.ISO_DATE);
        String localDateString2 = localDateTime1.format(DateTimeFormatter.ofPattern("yyy/MM/dd"));
        System.out.println(" ISO  format "+localDateString);
        System.out.println(" Custom  format "+localDateString2);
        System.out.println("Localized timezone format Italian "+localDateTime1
                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.ITALIAN)));


    }

}
