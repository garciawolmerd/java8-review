import java.util.function.IntBinaryOperator;

class PrimitiveSum {

  public static void main(String[] args) {
    IntBinaryOperator sumr = (x, y) -> x + y;

    System.out.println(sumr.applyAsInt(1, 2));
  }
}
