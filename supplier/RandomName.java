import java.util.function.Supplier;

class RandomName {

  public static void main(String[] args) {
    Supplier<String> randomName = () -> {
      String[] names = { "name1", "name2", "name3", "name4", "name5" };
      int index = (int)(Math.random() * 4);

      return names[index];
    };

    for (int i = 0; i < 5; i++) {
      System.out.println(randomName.get());
    }
  }
}
