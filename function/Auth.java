import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Scanner;

class Auth {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Predicate<String> checkUsername = user -> "dgarcia".equals(user);
    Predicate<String> checkPassword = pwd -> "java".equals(pwd);

    System.out.print("username: ");
    String username = scanner.next();
    System.out.print("password: ");
    String password = scanner.next();

    Function<String, String> lower = user -> user.toLowerCase();
    Function<String, String> first7 = user -> user.substring(0, 7);
    Function<String, String> first7Lowered = lower.compose(first7);

    boolean validUsername = checkUsername.test(first7Lowered.apply(username));
    boolean validPassword = checkPassword.test(password);

    System.out.println("Is username valid? " + validUsername);
    System.out.println("Is password valid? " + validPassword);
  }
}
