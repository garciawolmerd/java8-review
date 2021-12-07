import java.time.LocalDate;

class SimpleDateGetter {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();

    int day = date.getDayOfMonth();
    int month = date.getMonthValue();
    int year = date.getYear();

    System.out.println(String.format("%s/%s/%s", day, month, year));
  }
}
