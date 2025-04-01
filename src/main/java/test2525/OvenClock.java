package test2525;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int ovenTime = sc.nextInt();

        LocalDateTime now = LocalDateTime.now().withHour(hour).withMinute(minute).withSecond(0);
        now = now.plusMinutes(ovenTime);
        System.out.println(now.getHour() + " " + now.getMinute());
    }
}
