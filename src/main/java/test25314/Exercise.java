package test25314;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 4 != 0 || n < 4 || n > 1000) {
            return;
        }
        int count = n / 4;
        StringBuilder result = new StringBuilder("int");
        for (int i = 0; i < count; i++) {
            result.insert(0, "long ");
        }
        System.out.println(result.toString());
    }
}
