interface Interf {

  default public void m1() {
    System.out.println("default method");
  }
}

class OverriddenDefaultMethod implements Interf {

  @Override
  public void m1() {
    System.out.println("overridden method");
  }

  public static void main(String[] args) {
    OverriddenDefaultMethod app2 = new OverriddenDefaultMethod();

    app2.m1();
  }
}
