import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

class SomePeriod {

  public static void main(String[] args) {
    LocalDate birthday = LocalDate.of(1980, Month.NOVEMBER, 28);
    LocalDate today = LocalDate.now();
    Period period = Period.between(birthday, today);

    System.out.printf(
      "Your age is %d years, %d months and %d days",
      period.getYears(),
      period.getMonths(),
      period.getDays()
    );
  }
}
