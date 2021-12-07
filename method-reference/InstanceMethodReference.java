class InstanceMethodReference {

  public void m1() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Child thread");
    }
  }

  public static void main(String[] args) {
    InstanceMethodReference imr = new InstanceMethodReference();
    Runnable r = imr::m1;
    Thread t = new Thread(r);
    t.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main thread");
    }
  }
}
