package test4999;

import java.util.Scanner;

public class Ah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine().trim();
        String line2 = sc.nextLine().trim();
        String regex = "^a{0,999}h$";
        if (!line1.matches(regex) || !line2.matches(regex)) return;

        int length1 = line1.length();
        int length2 = line2.length();
        if (length1 < length2) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }


    }
}
