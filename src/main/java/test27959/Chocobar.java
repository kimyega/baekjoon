package test27959;

import java.util.Scanner;

public class Chocobar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int price = sc.nextInt();
        if (count < 1 || count > 100 || price < 1 || price > 10000) return;

        if (count * 100 < price) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}
