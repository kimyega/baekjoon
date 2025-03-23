package test16170;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Today {
  public static void main(String[] args) {
    ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
    int year = now.getYear();
    int month = now.getMonthValue();
    int day = now.getDayOfMonth();

    String formatMonth = String.format("%02d", month);
    String formatDay = String.format("%02d", day);

    System.out.println(year + "\n" + formatMonth + "\n" + formatDay);
  }
}
