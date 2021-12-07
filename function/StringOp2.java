import java.util.function.Function;

class StringOp2 {

  public static void main(String[] args) {
    Function<String, String> rmSpaces = s -> s.replaceAll(" ", "").trim();
    Function<String, Integer> fn = s -> s.length() - rmSpaces.apply(s).length();

    System.out.println(fn.apply("  Some String With Words "));
  }
}
