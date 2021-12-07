import java.util.function.BiConsumer;

class SimpleBiConsumerConcat {

  public static void main(String[] args) {
    BiConsumer<String, String> cnctr = (s1, s2) -> System.out.println(s1 + s2);

    cnctr.accept("Hello ", "world!");
  }
}
