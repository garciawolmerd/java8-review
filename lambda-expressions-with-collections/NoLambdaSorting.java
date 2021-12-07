import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer a, Integer b) {
    return b - a;
  }
}

public class NoLambdaSorting {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);

    System.out.println("Before sorting: " + list);
    Collections.sort(list, new MyComparator());
    System.out.println("After sorting: " + list);
  }
}
