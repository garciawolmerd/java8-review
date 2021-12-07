import java.time.ZonedDateTime;
import java.time.ZoneId;

class SomeZoneId {

  public static void main(String[] args) {
    ZoneId zone = ZoneId.systemDefault();

    System.out.println(zone);

    ZoneId prs = ZoneId.of("Europe/Paris");

    ZonedDateTime zdt = ZonedDateTime.now(prs);

    System.out.println(zdt);
  }
}
