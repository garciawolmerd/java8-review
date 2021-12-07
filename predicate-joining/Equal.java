import java.util.function.Predicate;

class Equal {

  public static void main(String[] args) {
    Predicate<String> p = Predicate.isEqual("dgarcia");

    System.out.println(p.test("name1"));
    System.out.println(p.test("dgarcia"));
  }
}
