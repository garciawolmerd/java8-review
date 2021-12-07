import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

class Movie {
  String name;
  String result;

  public Movie(String name, String result) {
    this.name = name;
    this.result = result;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}

class ConsumerChain {

  public static List<Movie> movies() {
    return Arrays.asList(
      new Movie("movie1", "hit"),
      new Movie("movie2", "flop"),
      new Movie("movie3", "flop"),
      new Movie("movie4", "hit"),
      new Movie("movie5", "flop")
    );
  }

  public static void main(String[] args) {
    Consumer<Movie> ready =
      movie -> System.out.println(String.format(
        "Movie %s is ready to release", movie.getName()
      ));

    Consumer<Movie> viewResult =
      movie -> System.out.println(String.format(
        "Movie %s is a %s", movie.getName(), movie.getResult()
      ));

    Consumer<Movie> save =
      movie -> System.out.println(String.format(
        "Movie %s is saved in database", movie.getName()
      ));

    Consumer<Movie> movieOperations = ready.andThen(viewResult).andThen(save);

    App4.movies()
      .stream()
      .forEach(movieOperations);
  }
}
