import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {

  private int id;
  private String name;
  private double dailyWage;

  public Employee(int id, String name, double dailyWage) {
    this.id = id;
    this.name = name;
    this.dailyWage = dailyWage;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDailyWage() {
    return this.dailyWage;
  }

  public void setDailyWage(double dailyWage) {
    this.dailyWage = dailyWage;
  }

  @Override
  public String toString() {
    return String.format(
      "Employee(id = %s, name = %s, dailyWage = %s)", id, name, dailyWage
    );
  }
}

class TimeSheet {

  private int id;
  private int days;

  public TimeSheet(int id, int days) {
    this.id = id;
    this.days = days;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getDays() {
    return this.days;
  }

  public void setDays(int days) {
    this.days = days;
  }

  @Override
  public String toString() {
    return String.format("TimeSheet(id = %s, days = %s)", id, days);
  }
}

class SalaryCalculator {

  public static Supplier<List<Employee>> employees() {
    return () -> Arrays.asList(
      new Employee(101, "Name1", 150),
      new Employee(201, "Name2", 250),
      new Employee(301, "Name3", 350)
    );
  }

  public static Supplier<List<TimeSheet>> timesheets() {
    return () -> Arrays.asList(
      new TimeSheet(101, 22),
      new TimeSheet(201, 20),
      new TimeSheet(301, 25)
    );
  }

  public static void main(String[] args) {
    BiFunction<Employee, TimeSheet, Double> monthlySalary =
      (e, t) -> e.getDailyWage() * t.getDays();

    List<Double> monthlySalaries =
      employees()
        .get()
        .stream()
        .map(employee -> monthlySalary.apply(
          employee,
          timesheets()
            .get()
            .stream()
            .filter(t -> t.getId() == employee.getId())
            .findFirst()
            .orElse(new TimeSheet(0, 0))
        ))
        .collect(Collectors.toList());

    System.out.println(monthlySalaries);
  }
}
