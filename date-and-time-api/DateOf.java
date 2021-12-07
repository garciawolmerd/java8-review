import java.time.LocalDateTime;
import java.time.Month;

public class DateOf {

  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.of(1980, Month.NOVEMBER, 28, 23, 40);

    System.out.println(ldt);

    System.out.println("After six months: " + ldt.plusMonths(6));
    System.out.println("Before six months: " + ldt.minusMonths(6));
  }
}
