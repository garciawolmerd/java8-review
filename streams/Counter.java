import java.util.Arrays;
import java.util.List;

class Counter {

  public static List<String> names() {
    return Arrays.asList("NameName1", "Name2", "NameName3", "Name4", "Name5");
  }

  public static void main(String[] args) {
    long count =
      names()
        .stream()
        .filter(s -> s.length() > 5)
        .count();

    System.out.println(count);
  }
}
