import java.util.function.Predicate;

class Predicate2 {

  public static void main(String[] args) {
    Predicate<String> p = (str) -> str.length() > 5;

    System.out.println(p.test("abcdef"));
    System.out.println(p.test("abc"));
  }
}
