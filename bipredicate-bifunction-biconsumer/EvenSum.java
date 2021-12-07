import java.util.function.BiPredicate;

class EvenSum {

  public static void main(String[] args) {
    BiPredicate<Integer, Integer> evenSum = (a, b) -> (a + b) % 2 == 0;

    System.out.println(evenSum.test(2, 2));
    System.out.println(evenSum.test(1, 2));
  }
}
