package test2884;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        LocalDateTime now = LocalDateTime.now().withHour(hour).withMinute(minute).withSecond(0);
        now = now.minusMinutes(45);
        System.out.println(now.getHour() + " " + now.getMinute());
    }
}
