import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSorting {
   
  public static void main(String[] args) {
    Set<Integer> set = new TreeSet<>((a, b) -> b - a);
    set.addAll(Arrays.asList(10, 0, 15, 25, 5, 20));
    System.out.println("Set: " + set);
  }
}
