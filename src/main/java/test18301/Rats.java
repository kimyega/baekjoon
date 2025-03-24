package test18301;

import java.util.Scanner;

public class Rats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] parts = line.split(" ");
        if (parts.length != 3) return;

        int n1 = Integer.parseInt(parts[0]);
        int n2 = Integer.parseInt(parts[1]);
        int n12 = Integer.parseInt(parts[2]);
        if (n1 < 0 || n1 > 10000 || n2 < 0 || n2 > 10000 || n12 < 0 || n12 > Math.min(n1, n2)) return;

        int result = (n1 + 1) * (n2 + 1) / (n12 + 1) - 1;
        System.out.println(result);
    }
}
