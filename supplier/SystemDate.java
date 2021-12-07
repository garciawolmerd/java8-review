import java.util.Date;
import java.util.function.Supplier;

class SystemDate {

  public static void main(String[] args) {
    Supplier<Date> date = () -> new Date();

    System.out.println(date.get());
  }
}
