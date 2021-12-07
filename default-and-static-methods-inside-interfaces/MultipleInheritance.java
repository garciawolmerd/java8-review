interface Left {

  public default void m1() {
    System.out.println("left default method");
  }
}

interface Right {

  public default void m1() {
    System.out.println("right default method");
  }
}

class MultipleInheritance implements Left, Right {

  @Override
  public void m1() {
    Left.super.m1();
  }

  public static void main(String[] args) {
    MultipleInheritance app3 = new MultipleInheritance();

    app3.m1();
  }
}
