import java.util.stream.Stream;

class Of {

  public static void main(String[] args) {
    Stream<Integer> ofValues = Stream.of(9, 99, 999, 9999, 99999);
    ofValues.forEach(System.out::println);

    Double[] d = { 1.0, 1.1, 1.2, 1.3, 1.4 };
    Stream<Double> ofArray = Stream.of(d);
    ofArray.forEach(System.out::println);
  }
}

