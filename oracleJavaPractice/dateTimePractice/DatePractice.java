package oracleJavaPractice.dateTimePractice;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatePractice {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd yyyy");

        LocalDate date = LocalDate.parse("January 09 1998", f);

        System.out.println(date);
    }
}
