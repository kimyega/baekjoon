package test16394;

import java.util.Scanner;

public class Hongik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1946 || year > 1000000) return;
        int var = year - 1946;
        System.out.println(var);
    }
}
