package test11382;

import java.util.Scanner;

public class JungMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] parts = line.split(" ");
        if (parts.length != 3) return;
        long result = 0;
        for(String part : parts) {
            long partInt = Long.parseLong(part);
            if (partInt < 0 || partInt > Math.pow(10, 12)) {
                return;
            }
            result += partInt;
        }
        System.out.println(result);
    }

}
