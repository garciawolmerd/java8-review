import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);

    System.out.println("Before sorting: " + list);
    Collections.sort(list, (a, b) -> b - a);
    System.out.println("After sorting: " + list);
  }
}
