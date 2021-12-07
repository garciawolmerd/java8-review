import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Person {

  String name;
  int age;
  boolean isHavingGF;

  Person() {
  }

  Person(String name, int age, boolean isHavingGF) {
    this.name = name;
    this.age = age;
    this.isHavingGF = isHavingGF;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean getIsHavingGF() {
    return isHavingGF;
  }

  public void setIsHavingGF(boolean isHavingGF) {
    this.isHavingGF = isHavingGF;
  }

  @Override
  public String toString() {
    return String.format(
      "Person[name=%s, age=%s, isHavingGF=%s]", name, age, isHavingGF
    );
  }
}

class Pass {

  public static void main(String[] args) {
    Person[] persons = {
      new Person("Name1", 40, false),
      new Person("Name2", 25, true),
      new Person("Name3", 26, true),
      new Person("Name4", 28, false),
      new Person("Name5", 17, true)
    };

    Predicate<Person> ofAge = person -> person.getAge() >= 18;
    Predicate<Person> hasGF = person -> person.getIsHavingGF();
    Predicate<Person> allowedIntoPub = ofAge.and(hasGF);

    Person[] filtered =
      Stream.of(persons).filter(allowedIntoPub).toArray(Person[]::new);

    System.out.println(Arrays.asList(filtered));
  }
}
