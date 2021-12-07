import java.util.function.IntUnaryOperator;

class SquarePrimitive {

  public static void main(String[] args) {
    IntUnaryOperator sqr = i -> i * i;

    System.out.println(sqr.applyAsInt(5));
  }
}
