package test31614;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TotalMinute {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();
    int minute = sc.nextInt();
    if (hour < 0 || hour > 23 || minute < 0  || minute > 59) return;

    LocalTime startTime = LocalTime.of(0, 0);
    LocalTime endTime = LocalTime.of(hour, minute);

    long totalminutes = ChronoUnit.MINUTES.between(startTime, endTime);
    System.out.println(totalminutes);
  }
}
