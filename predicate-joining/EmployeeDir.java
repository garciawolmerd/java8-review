import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {

  private String name;
  private String position;
  private double salary;
  private String city;

  Employee(String name, String position, double salary, String city) {
    this.name = name;
    this.position = position;
    this.salary = salary;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return String.format(
      "Employee(%s, %s, %.2f, %s)", name, position, salary, city
    );
  }
}

class EmployeeDir {

  public static List<Employee> employees() {
    return Arrays.asList(
      new Employee("Name1", "CEO", 30000, "Hyderabad"),
      new Employee("Name2", "Manager", 20000, "Hyderabad"),
      new Employee("Name3", "Manager", 20000, "Bangalore"),
      new Employee("Name4", "Lead", 15000, "Hyderabad"),
      new Employee("Name5", "Lead", 15000, "Bangalore"),
      new Employee("Name6", "Developer", 10000, "Hyderabad"),
      new Employee("Name7", "Developer", 10000, "Hyderabad"),
      new Employee("Name8", "Developer", 10000, "Bangalore"),
      new Employee("Name9", "Developer", 10000, "Bangalore")
    );
  }

  public static void print(List<Employee> employees) {
    System.out.println(employees);
    System.out.println("\n************************************************\n");
  }

  public static Predicate<Employee> isManager() {
    return employee -> "manager".equals(employee.getPosition().toLowerCase());
  }

  public static Predicate<Employee> isBangalore() {
    return employee -> "bangalore".equals(employee.getCity().toLowerCase());
  }

  public static Predicate<Employee> salaryLT20K() {
    return employee -> employee.getSalary() < 20000;
  }

  public static List<Employee> filter(List<Employee> l, Predicate<Employee> p) {
    return l.stream().filter(p).collect(Collectors.toList());
  }

  public static List<Employee> managers(List<Employee> employees) {
    return App5.filter(employees, App5.isManager());
  }

  public static List<Employee> bangalores(List<Employee> employees) {
    return App5.filter(employees, App5.isBangalore());
  }

  public static List<Employee> salarysLT20K(List<Employee> employees) {
    return App5.filter(employees, App5.salaryLT20K());
  }

  public static List<Employee> managersFromBangalore(List<Employee> employees) {
    return App5.filter(employees, App5.isManager().and(App5.isBangalore()));
  }

  public static List<Employee> managerOrSalatyLS20K(List<Employee> employees) {
    return App5.filter(employees, App5.isManager().or(App5.salaryLT20K()));
  }

  // Predicate.not method is only available in java 11 or greater

  public static List<Employee> notManagers(List<Employee> employees) {
    return App5.filter(employees, Predicate.not(App5.isManager()));
  }

  public static void main(String[] args) {
    App5.print(App5.employees());
    App5.print(App5.managers(App5.employees()));
    App5.print(App5.bangalores(App5.employees()));
    App5.print(App5.salarysLT20K(App5.employees()));
    App5.print(App5.managersFromBangalore(App5.employees()));
    App5.print(App5.managerOrSalatyLS20K(App5.employees()));
    App5.print(App5.notManagers(App5.employees()));

    Employee emp1 = new Employee("Name1", "CEO", 30000, "Hyderabad");
    Predicate<Employee> emp =
      Predicate.isEqual(emp1);
    System.out.println(
      emp.test(emp1)
    );
    System.out.println(
      emp.test(new Employee("Name2", "Manager", 20000, "Hyderabad"))
    );
  }
}
