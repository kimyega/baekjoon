package test29699;

import java.util.Scanner;

public class Smupc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if (count < 1 || count > 1000000) return;

        String str = "WelcomeToSMUPC";
        int index = count % str.length();

        if (index == 0) {
            index = str.length() - 1;
        } else {
            index--;
        }
        System.out.println(str.charAt(index));
    }
}
