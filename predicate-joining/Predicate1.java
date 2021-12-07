import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Predicate1 {

  public static void main(String[] args) {
    String[] names = { "Joca", "Carlos", "Maisa", "Carina", "Cornelia" };

    Predicate<String> startsWithKIgnoreCase =
      s -> s.toLowerCase().startsWith("c");

    String[] filtered =
      Stream.of(names).filter(startsWithKIgnoreCase).toArray(String[]::new);

    System.out.println(Arrays.asList(filtered));
  }
}
