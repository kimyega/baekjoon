package test27324;

import java.util.Scanner;

public class SameNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 10 || num > 99) return;

        if (num / 10 == num % 10) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
