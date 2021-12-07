import java.util.Map;
import java.util.TreeMap;

public class TreeMapSorting {

  public static void main(String[] args) {
    Map<Integer, String> map = new TreeMap<>((a,b) -> b - a);

    map.put(1, "Durga");
    map.put(6, "Sunny");
    map.put(3, "Bunny");
    map.put(2, "Chinny");
    map.put(5, "Vinny");
    map.put(4, "Pinny");

    System.out.println("Map: " + map);
  }
}
