import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Movie {

  private String name;
  private String hero;
  private String heroine;

  Movie(String name, String hero, String heroine) {
    this.name = name;
    this.hero = hero;
    this.heroine = heroine;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHero() {
    return hero;
  }

  public void setHero(String hero) {
    this.hero = hero;
  }

  public String getHeroine() {
    return heroine;
  }

  public void setHeroine(String heroine) {
    this.heroine = heroine;
  }

  @Override
  public String toString() {
    return String.format(
      "Movie(name = %s, hero = %s, heroine = %s",
      name, hero, heroine
    );
  }
}

class MoviePrinter {

  public static List<Movie> movies() {
    return Arrays.asList(
      new Movie("title1", "hero1", "heroine1"),
      new Movie("title2", "hero2", "heroine2"),
      new Movie("title3", "hero3", "heroine3"),
      new Movie("title4", "hero4", "heroine4"),
      new Movie("title5", "hero5", "heroine5")
    );
  }

  public static void main(String[] args) {
    Consumer<Movie> printer = movie -> System.out.println(movie);

    App2.movies()
      .stream()
      .forEach(printer);
  }
}
