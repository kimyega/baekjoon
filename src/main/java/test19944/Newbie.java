package test19944;

import java.util.Scanner;

public class Newbie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n < 3 || n > 1000 || m < 1 || m > 1000) return;

        if (m < 3) {
            System.out.println("NEWBIE!");
        } else if (m <= n) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
    }
}
