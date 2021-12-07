import java.time.Year;
import java.util.Scanner;

class SomeYear {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int y = sc.nextInt();
    Year year = Year.of(y);

    if (year.isLeap()) {
      System.out.printf("%d is a leap year\n", y);
    } else {
      System.out.printf("%d is not a leap year\n", y);
    }
  }
}
