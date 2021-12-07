interface Interf {

  public void m1();
}

class AnonymousScope2 {

  int x = 888;

  public void m2() {
    Interf i = () -> {
      int x = 999;

      System.out.println(this.x);
    };
    i.m1();
  }

  public static void main(String[] args) {
    App5 app5 = new App5();
    app5.m2();
  }
}
