package test27331;

import java.util.Scanner;

public class twoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tens = sc.nextInt();
        int ones = sc.nextInt();
        if (tens < 1 || tens > 9 || ones < 0 || ones > 9) return;

        int result = tens * 10 + ones;
        System.out.println(result);
    }
}
