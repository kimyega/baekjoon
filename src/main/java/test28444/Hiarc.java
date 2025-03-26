package test28444;

import java.util.Scanner;

public class Hiarc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int result = HiarcCalc(line);
        if (result == Integer.MIN_VALUE) return;
        System.out.println(result);

    }
    public static int HiarcCalc(String line) {
        int result1 = 1, result2 = 1;
        String[] parts = line.split(" ");
        if (parts.length != 5) return Integer.MIN_VALUE;
        for (int i = 0; i < parts.length; i++) {
            int part = Integer.parseInt(parts[i]);
            if (part < 0 || part > 100) return Integer.MIN_VALUE;
            if (i < 2) {
                result1 *= part;
            } else {
                result2 *= part;
            }
        }
        return result1 - result2;
    }
}
