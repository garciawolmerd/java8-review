interface Interf {

  public void m1();
}

class AnoymousScope3 {

  int x = 10;

  public void m2() {
    int y = 20;

    Interf i = () -> {
      System.out.println(x);
      System.out.println(y);
    };
    i.m1();
  }

  public static void main(String[] args) {
    App6 app6 = new App6();
    app6.m2();
  }
}
