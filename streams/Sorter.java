import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Sorter {

  public static List<Integer> numbers() {
    return Arrays.asList(0, 10, 20, 5, 15, 25);
  }

  public static void main(String[] args) {
    List<Integer> naturalSortedList =
      numbers()
        .stream()
        .sorted()
        .collect(Collectors.toList());
    List<Integer> comparatorSortedList =
      numbers()
        .stream()
        .sorted((a, b) -> b.compareTo(a))
        .collect(Collectors.toList());

    System.out.println(naturalSortedList);
    System.out.println(comparatorSortedList);
  }
}
