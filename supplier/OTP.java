import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.List;

class OTP {

  public static Integer[] multipliers() {
    return new Integer[] {1};
  }

  public static List<Integer> mult(List<Integer> m, int digits) {
    if (digits == 1) {
      m.add((int) Math.pow(10, 0));
      return m;
    }
    else {
      m.add((int) Math.pow(10, digits - 1));
      return mult(m, digits - 1);
    }
  }

  public static void main(String[] args) {
    Supplier<Integer> digit = () -> (int)(Math.random() * 10);

    int digits = 4;
    List<Integer> m = OTP.mult(new ArrayList<Integer>(), digits);

    int otp = m
      .stream()
      .reduce(0, (acc, value) -> acc + value * digit.get());
      
    System.out.println(otp);
  }
}
