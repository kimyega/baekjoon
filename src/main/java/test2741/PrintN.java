package test2741;

import java.util.Scanner;

public class PrintN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0 || n > 100000) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);
        }
    }
}
