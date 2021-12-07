import java.util.Arrays;
import java.util.function.Function;
import java.util.List;
import java.util.stream.Collectors;

class Student {

  private String name;
  private int marks;

  Student() {
  }

  Student(String name, int marks) {
    this.name = name;
    this.marks = marks;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  @Override
  public String toString() {
    return String.format("Student(name = %s, marks = %s)", name, marks);
  }
}

class StudentGrader {

  public static List<Student> students() {
    return Arrays.asList(
      new Student("Name1", 100),
      new Student("Name2", 65),
      new Student("Name3", 55),
      new Student("Name4", 45),
      new Student("Name5", 25)
    );
  }

  public static String grade(int marks) {
    if (marks >= 80) {
      return "A[Distinction]";
    } else if (marks >= 60) {
      return "B[First class]";
    } else if (marks >= 50) {
      return "C[Second class]";
    } else if (marks >= 35) {
      return "D[Third class]";
    } else {
      return "E[Failed]";
    }
  }

  public static void main(String[] args) {
    Function<Student, String> getGrade =
      student -> App5.grade(student.getMarks());

    List<String> grades = App5.students()
      .stream()
      .map(getGrade)
      .collect(Collectors.toList());

    System.out.println(grades);
  }
}
