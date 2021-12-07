import java.util.function.UnaryOperator;

class Square {

  public static void main(String[] args) {
    UnaryOperator<Integer> sqr = i -> i * i;

    System.out.println(sqr.apply(2));
  }
}
