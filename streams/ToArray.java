import java.util.Arrays;
import java.util.List;

class ToArray {

  public static List<Integer> numbers() {
    return Arrays.asList(0, 10, 20, 5, 15, 25);
  }

  public static void main(String[] args) {
    Integer[] array =
      numbers()
        .stream()
        .toArray(Integer[]::new);

    for(Integer x : array) {
      System.out.println(x);
    }
  }
}
