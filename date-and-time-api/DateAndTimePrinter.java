import java.time.LocalDate;
import java.time.LocalTime;

class DateAndTimePrinter {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    System.out.println(date);
    System.out.println(time);
  }
}
