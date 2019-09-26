package JodaTimeTask;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.DayOfWeek;

import static javax.xml.bind.DatatypeConverter.parseDateTime;

public class JodaTime{
    private static DateTimeFormatter formatter_YYYY_MM_DD = DateTimeFormat.forPattern("yyyy-MM-dd");
    private static DateTimeFormatter formatter_MM_DD_YYYY = DateTimeFormat.forPattern("MM/dd/yyyy");
    private static DateTimeFormatter formatter_DD_MM_YYYY = DateTimeFormat.forPattern("dd-MM-yyyy");
    private static DateTimeFormatter longFormatter = DateTimeFormat.forPattern("yyyy-MM-dd.HH.mm.ss.SS");


    public static void main(String[] args) {

        DateTime currentDate = new DateTime();
        System.out.println("Current date: " + currentDate);
        String input = precondition(currentDate);
        task1(precondition(currentDate), formatter_YYYY_MM_DD, formatter_MM_DD_YYYY);
        task2(precondition(currentDate), formatter_YYYY_MM_DD, formatter_DD_MM_YYYY);
        task3(precondition(currentDate), formatter_YYYY_MM_DD, formatter_DD_MM_YYYY);
        task4(precondition(currentDate), formatter_YYYY_MM_DD, longFormatter);
        task5(precondition(currentDate), formatter_YYYY_MM_DD, longFormatter);
        task6(DateTimeFormat.forPattern("yyyy-MM-dd.HH.mm.ss.SS"));
//        task7(precondition(currentDate), formatter_YYYY_MM_DD, longFormatter);
        task8(DateTime.parse(precondition(currentDate)));


        LocalDate dateForCompare = new LocalDate(968498900000L);
        String dateInFutureFormatted = formatter_DD_MM_YYYY.print(dateForCompare);
//        boolean isBefore = currentDate.isBefore(dateForCompare);
//        System.out.println(currentDate + " is before " + dateInFutureFormatted + " : " + isBefore);
    }

    private static String precondition(DateTime date) {
        return formatter_YYYY_MM_DD.print(date);
    }

    private static String task1(String date, DateTimeFormatter inputFormatter, DateTimeFormatter outputFormatter) {
        return outputFormatter.print(inputFormatter.parseDateTime(date));
    }

    private static String task2(String date, DateTimeFormatter inputFormatter, DateTimeFormatter outputFormatter) {
        return outputFormatter.print(inputFormatter.parseDateTime(date));
    }

    private static String task3(String date, DateTimeFormatter inputFormatter, DateTimeFormatter outputFormatter) {
        return outputFormatter.print(inputFormatter.parseDateTime(date));
    }

    private static String task4(String date, DateTimeFormatter inputFormatter, DateTimeFormatter outputFormatter) {
        return outputFormatter.print(inputFormatter.parseDateTime(date).withTimeAtStartOfDay().getMillis());
    }

    private static String task5(String date, DateTimeFormatter inputFormatter, DateTimeFormatter outputFormatter) {
        return outputFormatter.print(inputFormatter.parseDateTime(date).millisOfDay().withMaximumValue().getMillis());
    }

    private static String task6(DateTimeFormatter date) {
        return String.valueOf(date) ;
    }

    private static String task8(DateTime currentDate) {
        return String.valueOf(DayOfWeek.of(currentDate.getDayOfWeek()));
    }
}