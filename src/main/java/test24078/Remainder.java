package test24078;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 1 || x > 100) return;
        System.out.println(x % 21);
    }
}
