import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

class Predicate3 {

  public static void main(String[] args) {
    Predicate<Collection> p = c -> c.isEmpty();
    
    System.out.println(p.test(Arrays.asList("asdf")));
    System.out.println(p.test(new ArrayList()));
  }
}
