package test2558;

import java.util.Scanner;

public class Plus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0 || a > 10) {
            return;
        }
        int b = sc.nextInt();
        if (b < 0 || b > 10) {
            return;
        }
        System.out.println(a + b);
    }
}
