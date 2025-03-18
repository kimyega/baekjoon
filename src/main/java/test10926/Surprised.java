package test10926;

import java.util.Scanner;

public class Surprised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String LowercasePattern = "^[a-z]+$";
        if (name.length() <= 0 || name.length() > 50 ||!name.matches(LowercasePattern)) {
            return;
        }
        System.out.println(name + "??!");
    }
}
