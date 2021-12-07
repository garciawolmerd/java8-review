import java.util.function.Function;

class Identity {

  public static void main(String[] args) {
    Function<String, String> id = Function.identity();

    System.out.println(id.apply("dgarcia"));
  }
}
