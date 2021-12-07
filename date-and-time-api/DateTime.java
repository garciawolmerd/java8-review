import java.time.LocalDateTime;

public class DateTime {

  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();

    System.out.println(dateTime);

    int day = dateTime.getDayOfMonth();
    int month = dateTime.getMonthValue();
    int year = dateTime.getYear();

    System.out.printf("%d-%d-%d", day, month, year);

    int hour = dateTime.getHour();
    int minute = dateTime.getMinute();
    int second = dateTime.getSecond();
    int nano = dateTime.getNano();

    System.out.printf("\n%d:%d:%d:%d", hour, minute, second, nano);
  }
}
