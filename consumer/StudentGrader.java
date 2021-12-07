import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;

class Student {

  private String name;
  private int marks;

  public Student(String name, int marks) {
    this.name = name;
    this.marks = marks;
  }

  public String getName() {
    return name;
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

interface MappedStudent {
  public String getName();
  public String getGrade();
}

class StudentGrader {

  public static List<Student> students() {
    return Arrays.asList(
      new Student("student1", 100),
      new Student("student2", 65),
      new Student("student3", 55),
      new Student("student4", 45),
      new Student("student5", 25)
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

  public static void printer(MappedStudent st) {
    System.out.println(
      String.format("Name = %s, grade = %s", st.getName(), st.getGrade())
    );
  }

  public static void main(String[] args) {
    Predicate<Student> marksGT60 = student -> student.getMarks() >= 60;

    Function<Student, MappedStudent> mapStudent =
      student -> new MappedStudent() {
        String name = student.getName();
        String grade = App3.grade(student.getMarks());

        public String getName() {
          return name;
        }

        public String getGrade() {
          return grade;
        }
      };

    Consumer<MappedStudent> print = student -> App3.printer(student);


    App3.students()
      .stream()
      .filter(marksGT60)
      .map(mapStudent)
      .forEach(print);
  }
}
