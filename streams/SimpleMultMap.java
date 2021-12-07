import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SimpleMultMap {

  public static List<Integer> numbers() {
    return Arrays.asList(0, 10, 20, 5, 15, 25);
  }

  public static void main(String[] args) {
    List<Integer> mapped =
      numbers()
        .stream()
        .map(x -> x * 2)
        .collect(Collectors.toList());

    System.out.println(mapped);
  }
}
