import java.util.function.Function;

class Squarer {

  public static void main(String[] args) {
    Function<Integer, Integer> fn = i -> i * i;

    System.out.println(fn.apply(2));
  }
}
