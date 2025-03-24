package test7891;

import java.util.Scanner;

public class CanYouDoThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        sc.nextLine();
        if (caseNo < 1 || caseNo > 100) return;
        int[] sum = new int[caseNo];
        for (int i = 0; i < caseNo; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");
            if (parts.length != 2) return;

            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            int digits = (int) Math.pow(10, 9);
            if (x < digits * -1 || x > digits || y < digits * -1 || y > digits) return;

            sum[i] = x + y;
        }
        for (int result : sum) {
            System.out.println(result);
        }
    }
}
