import java.util.function.BiFunction;

class FunctionMultiplication {

  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> mult = (x, y) -> x * y;

    System.out.println(mult.apply(10, 20));
  }
}
