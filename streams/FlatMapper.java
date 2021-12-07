import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class FlatMapper {

  public static List<List<String>> names() {
    return Arrays.asList(
      Arrays.asList("name1", "name2", "name3"), 
      Arrays.asList("name4", "name5", "name6")
    );
  }

  public static Map<String, List<String>> namesMap() {
    Map<String, List<String>> map = new HashMap<>();
    map.put("q1", Arrays.asList("name1", "name2", "name3"));
    map.put("q2", Arrays.asList("name4", "name5", "name6"));
    return map;
  }

  public static void main(String[] args) {
    List<String> flattenedList =
      names()
        .stream()
        .flatMap(el -> el.stream())
        .collect(Collectors.toList());

    List<String> flattenedMap =
      namesMap()
        .values()
        .stream()
        .flatMap(el -> el.stream())
        .collect(Collectors.toList());

    flattenedList.forEach(System.out::println);
    flattenedMap.forEach(System.out::println);
  }
}
