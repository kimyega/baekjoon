package test33165;

import java.util.Scanner;

public class Footrace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int v = sc.nextInt();
        if (t < 1 || v < 1 || t > 100 || v > 100) return;

        int result = t * v;
        System.out.println(result);
    }
}
