package test31654;

import java.util.Scanner;

public class AddingTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = (int) Math.pow(10, 9);
        int min =  max * -1;
        if (a < min || a > max || b < min || b > max || c < min || c > max) return;

        int sum = a + b;
        if (c == sum) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
        sc.close();
    }
}
