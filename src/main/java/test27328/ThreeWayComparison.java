package test27328;

import java.util.Scanner;

public class ThreeWayComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 1 || a > 1000 || b < 1 || b > 1000) return;

        if (a < b) {
            System.out.println(-1);
        } else if (a == b) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
