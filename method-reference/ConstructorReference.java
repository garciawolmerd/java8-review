class SomeClass {

  public SomeClass() {
    System.out.println("Some class instantiated");
  }
}

interface Interface {

  public SomeClass get();
}

class ConstructorReference {
  public static void main(String[] args) {
    Interface i = SomeClass::new;

    SomeClass sc = i.get();
  }
}
