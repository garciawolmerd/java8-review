import java.util.function.BiFunction;

class Student {

  private String name;
  private Integer rollNo;

  public Student(String name, Integer rollNo) {
    this.name = name;
    this.rollNo = rollNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getRollNo() {
    return rollNo;
  }

  public void setRollNo(Integer rollNo) {
    this.rollNo = rollNo;
  }

  @Override
  public String toString() {
    return String.format("Student(name = %s, rollNo = %s)", name, rollNo);
  }
}

class StudentCreation {

  public static void main(String[] args) {
    BiFunction<String, Integer, Student> studentFactory =
      (name, rollNo) -> new Student(name, rollNo);

    System.out.println(studentFactory.apply("Name1", 1));
    System.out.println(studentFactory.apply("Name2", 2));
    System.out.println(studentFactory.apply("Name3", 3));
  }
}
