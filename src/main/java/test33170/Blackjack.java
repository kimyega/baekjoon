package test33170;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (num < 1 || num > 13) return;
            sum += num;
        }
        if (sum > 21) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
