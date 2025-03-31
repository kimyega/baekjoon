package test32458;

import java.util.Scanner;

public class JustRoundDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xStr = sc.nextLine().trim();
        String[] parts = xStr.split("\\.");
        if (xStr.getBytes().length > 15 || parts.length != 2 || !xStr.matches("\\d+\\.\\d+") || parts[0].startsWith("0")) return;

        double x = Double.parseDouble(xStr);
        if (x <= 0 || x > Math.pow(10, 8)) return;
        System.out.println(parts[0]);
    }
}
