interface Interface {

  public void m1();
}

class StaticMethodReference {

  public static void m2() {
    System.out.println("Implementation by method reference");
  }

  public static void main(String[] args) {
    Interface i = StaticMethodReference::m2;

    i.m1();
  }
}
