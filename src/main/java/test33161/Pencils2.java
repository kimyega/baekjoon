package test33161;

import java.util.Scanner;

public class Pencils2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money < 1 || money > 100) return;

        int result = money / 5;
        System.out.println(result);
    }
}
