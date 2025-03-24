package test27294;

import java.util.Scanner;

public class HowMuch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int hasAlcohol = sc.nextInt();
        if (hour < 0 || hour > 23 || hasAlcohol < 0 || hasAlcohol > 1) {
            return;
        } else if (hour < 12 || hour > 16 || hasAlcohol == 1) {
            System.out.println(280);
        } else {
            System.out.println(320);
        }


    }
}
