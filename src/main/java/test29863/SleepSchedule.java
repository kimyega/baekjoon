package test29863;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class SleepSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sleepHour = sc.nextInt();
        int alarmHour = sc.nextInt();

        LocalTime sleepTime = LocalTime.of(sleepHour, 0);
        LocalTime alarmTime = LocalTime.of(alarmHour, 0);
        if (sleepHour >= 20) {
            alarmTime = alarmTime.plusHours(24);
        }

        Duration duration = Duration.between(sleepTime, alarmTime);
        int hours = (int) duration.toHours();
        System.out.println(hours);
    }
}
