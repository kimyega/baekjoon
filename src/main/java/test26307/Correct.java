package test26307;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Correct {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int submissionHour = sc.nextInt();
    int submissionMinute = sc.nextInt();
    if (submissionHour < 9 || submissionHour > 11 || submissionMinute < 0 || submissionMinute > 59) return;

    LocalTime startTime = LocalTime.of(9, 0);
    LocalTime submissionTime = LocalTime.of(submissionHour, submissionMinute);
    Duration duration = Duration.between(startTime, submissionTime);

    long minutesPassed = duration.toMinutes();
    System.out.println(minutesPassed);
  }
}
