import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee {

  private int id;
  private String name;

  Employee() {
  }

  Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Employee[id = %s, name = %s]", id, name);
  }
}

class CustomClassSorting {

  public static void main(String[] args) {
    List<Employee> list = Arrays.asList(
      new Employee(2, "Name1"),
      new Employee(4, "Name2"),
      new Employee(3, "Name3"),
      new Employee(1, "Name4")
    );

    System.out.println("Before sorting: " + list);
    Collections.sort(list, (e1, e2) -> e2.getId() - e1.getId());
    System.out.println("After sorting: " + list);
  }
}
