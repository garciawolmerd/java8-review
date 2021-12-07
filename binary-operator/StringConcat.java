import java.util.function.BinaryOperator;

class StringConcat {

  public static void main(String[] args) {
    BinaryOperator<String> cnctr = (s1, s2) -> s1 + s2;

    System.out.println(cnctr.apply("Hello ", "world!"));
  }
}
