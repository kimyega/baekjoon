package test15680;

import java.util.Scanner;

public class Yonsei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n != 0 && n != 1) {
            return;
        } else if (n == 0){
            System.out.println("YONSEI");
        } else {
            System.out.println("Leading the Way to the Future");
        }

    }
}
