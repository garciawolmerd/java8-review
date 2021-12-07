import java.time.LocalTime;

class SimpleTimeGetter {

  public static void main(String[] args) {
    LocalTime time = LocalTime.now();
    int hour = time.getHour();
    int minutes = time.getMinute();
    int seconds = time.getSecond();
    int nano = time.getNano();

    System.out.printf("%d:%d:%d:%d", hour, minutes, seconds, nano);
  }
}
