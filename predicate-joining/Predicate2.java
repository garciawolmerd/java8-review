// String.isBlank is only available in jdk 11 or greater

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Predicate2 {

  public static void main(String[] args) {
    String[] names = { "Name1", "", null, "Name2", "", "Name3", null };

    Predicate<String> isNull = s -> s == null;
    Predicate<String> isBlank = s -> s.isBlank();
    Predicate<String> isNullOrIsBlank = isNull.or(isBlank);
    Predicate<String> isNotNullAndIsNotBlank = Predicate.not(isNullOrIsBlank);


    String[] filtered =
      Stream.of(names).filter(isNotNullAndIsNotBlank).toArray(String[]::new);

    System.out.println(Arrays.asList(filtered));
  }
}
