package test29863;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class SleepSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sleepHour = sc.nextInt();
        int alarmHour = sc.nextInt();
        if ((sleepHour < 20 || sleepHour > 23) && (sleepHour < 0 || sleepHour > 3) || alarmHour < 5 || alarmHour > 10) return;

        LocalDateTime sleepTime = LocalDateTime.now().withHour(sleepHour).withMinute(0).withSecond(0);
        LocalDateTime alarmTime = sleepTime.plusDays(1).withHour(alarmHour).withMinute(0).withSecond(0);
        if (sleepHour <= 3) {
            sleepTime = sleepTime.plusDays(1);
        }

        Duration duration = Duration.between(sleepTime, alarmTime);
        int hours = (int) duration.toHours();
        System.out.println(hours);
    }
}
