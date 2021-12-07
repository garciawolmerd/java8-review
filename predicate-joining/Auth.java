import java.util.function.Predicate;
import java.util.Scanner;

interface Credentials {

  public static String username() {
    return "dgarcia";
  }

  public static String password() {
    return "d080028";
  }
}

class User {

  private String username;
  private String password;

  User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

class Auth {

  public static void main(String[] args) {
    Predicate<User> correctUsername =
      user -> Credentials.username().equals(user.getUsername());
    Predicate<User> correctPassword =
      user -> Credentials.password().equals(user.getPassword());
    Predicate<User> correctCredentials = correctUsername.and(correctPassword);

    Scanner scanner = new Scanner(System.in);

    System.out.print("username: ");
    String username = scanner.next();
    System.out.print("password: ");
    String password = scanner.next();

    System.out.println(correctCredentials.test(new User(username, password)));
    scanner.close();
  }
}
