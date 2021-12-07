interface Interf {

  default void m1() {
    System.out.println("default method");
  }
}

class DefaultMethod implements Interf {

  public static void main(String[] args) {
    DefaultMethod app = new DefaultMethod();

    app.m1();
  }
}
