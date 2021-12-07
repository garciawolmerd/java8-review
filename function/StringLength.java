import java.util.function.Function;

class StringLength {

  public static void main(String[] args) {
    Function<String, Integer> fn = s -> s.length();

    System.out.println(fn.apply("dgarcia"));
  }
}
