
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTest {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    LocalDate yesterday = date.minusDays(1); // Gives the instance Date The Moment
    LocalDate tomorrow = yesterday.plusDays(2);// Gives a day ago
    LocalDate nextWeek = date.plusDays(7);// Gives next weeK Date
    System.out.println("Today date: " + date);
    System.out.println("Yesterday date: " + yesterday);
    System.out.println("Tomorrow date: " + tomorrow);
    System.out.println("NextWeek will be" + nextWeek);

    // Tests whether a date is Leap Year or not?
    LocalDate date1 = LocalDate.of(2017, 1, 13);
    System.out.println(date1.isLeapYear());
    LocalDate date2 = LocalDate.of(2016, 9, 23);
    System.out.println(date2.isLeapYear());

    LocalDate d1 = LocalDate.now();
    String d1Str = d1.format(DateTimeFormatter.ISO_DATE);
    System.out.println("Date1 in string :  " + d1Str);
    // Example 2
    LocalDate d2 = LocalDate.of(2002, 05, 01);
    String d2Str = d2.format(DateTimeFormatter.ISO_DATE);
    System.out.println("Date2 in string :  " + d2Str);
    // Example 3
    LocalDate d3 = LocalDate.of(2016, 11, 01);
    String d3Str = d3.format(DateTimeFormatter.ISO_DATE);
    System.out.println("Date3 in string :  " + d3Str);
  }
}
