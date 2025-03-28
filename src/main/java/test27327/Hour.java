package test27327;

import java.util.Scanner;

public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day < 1 || day > 365) return;
        int hour = day * 24;
        System.out.println(hour);
    }
}
