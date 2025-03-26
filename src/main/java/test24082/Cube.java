package test24082;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 1 || x > 1000) return;
        int result = (int) Math.pow(x, 3);
        System.out.println(result);
        sc.close();
    }
}
