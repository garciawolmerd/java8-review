import java.util.function.Consumer;

class HelloWorld {

  public static void main(String[] args) {
    Consumer<String> printer = s -> System.out.println(s);

    printer.accept("Hello consumer world!");
  }
}
