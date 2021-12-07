import java.util.function.Function;

class StringOp {

  public static void main(String[] args) {
    Function<String, String> fn = s -> s.replaceAll(" ", "").toLowerCase();

    System.out.println(fn.apply("Some No Lowered Case String"));
  }
}
