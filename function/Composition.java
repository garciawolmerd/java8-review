import java.util.function.Function;

class Composition {

  public static void main(String[] args) {
    Function<Integer, Integer> doubleIt = i -> i * 2;
    Function<Integer, Integer> cubeIt = i -> i * i * i;
    Function<Integer, Integer> piped = doubleIt.andThen(cubeIt);
    Function<Integer, Integer> composed = doubleIt.compose(cubeIt);

    System.out.println(piped.apply(2));
    System.out.println(composed.apply(2));
  }
}
