package test26766;

import java.util.Scanner;

public class Heart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 1 || num > 100000) return;

        for (int i = 0; i < num; i++) {
            System.out.println(" @@@   @@@ \n" +
                    "@   @ @   @\n" +
                    "@    @    @\n" +
                    "@         @\n" +
                    " @       @ \n" +
                    "  @     @  \n" +
                    "   @   @   \n" +
                    "    @ @    \n" +
                    "     @      ");
        }
    }
}
