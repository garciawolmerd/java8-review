import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

class Employee {

  private String name;
  private double salary;

  Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("Employee(name = %s, salary = %.2f)", name, salary);
  }
}

class SalaryIncreaser {

  public static List<Employee> employees() {
    return Arrays.asList(
      new Employee("Name1", 1000),
      new Employee("Name2", 2000),
      new Employee("Name3", 3000),
      new Employee("Name4", 4000),
      new Employee("Name5", 5000)
    ); 
  }

  public static void main(String[] args) {
    Function<Employee, Double> salary = employee -> employee.getSalary();

    double total =
      App6.employees()
        .stream()
        .map(salary)
        .reduce(0.0, (a, b) -> a + b);

    System.out.println(total);

    Predicate<Employee> salaryLT3500 = employee -> employee.getSalary() < 3500;
    Function<Employee, Employee> incSalary =
      employee -> new Employee(employee.getName(), employee.getSalary() + 477);

    List<Employee> employeesIncreased =
      App6.employees()
        .stream()
        .filter(salaryLT3500)
        .map(incSalary)
        .collect(Collectors.toList());

    // Predicate.not() method requires jdk 11 or greater

    List<Employee> employeesNotIncreased =
      App6.employees()
        .stream()
        .filter(Predicate.not(salaryLT3500))
        .collect(Collectors.toList());

    List<Employee> employees =
      Stream
        .concat(employeesIncreased.stream(), employeesNotIncreased.stream())
        .collect(Collectors.toList());

    System.out.println(employees);
  }
}
