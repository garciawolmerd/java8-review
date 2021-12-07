interface Interf {

  public void m1();
}

class App4 {

  int x = 888;

  public void m2() {
    Interf i = new Interf() {
      int x = 999;
      public void m1() {
        System.out.println(this.x);
      }
    };
    i.m1();
  }

  public static void main(String[] args) {
    App4 app4 = new App4();
    app4.m2();
  }
}
