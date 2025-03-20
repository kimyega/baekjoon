package test2420;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        int max = 2000000000;
        int min = -2000000000;
        if (n < min || n > max || m < min || m > max) {
            return;
        }
        System.out.println(Math.abs(n - m));
    }
}
