package test30224;

import java.util.Scanner;

public class Lucky7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();
        int num = Integer.parseInt(numStr);
        if (num < 1 || num > Math.pow(10,9)) return;

        boolean isLucky = numStr.contains("7");
        boolean isLuckyDivide = num % 7 == 0;
        if (!isLucky && !isLuckyDivide){
            System.out.println(0);
        } else if (!isLucky) {
            System.out.println(1);
        } else if (!isLuckyDivide) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
