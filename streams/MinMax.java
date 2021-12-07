import java.util.Arrays;
import java.util.List;

class MinMax {

  public static List<Integer> numbers() {
    return Arrays.asList(0, 10, 20, 5, 15, 25);
  }

  public static void main(String[] args) {
    Integer min =
      numbers()
        .stream()
        .min((a, b) -> a.compareTo(b))
        .get();

    Integer max =
      numbers()
        .stream()
        .max((a, b) -> a.compareTo(b))
        .get();

    System.out.println(String.format("[%s, %s]", min, max));
  }
}
