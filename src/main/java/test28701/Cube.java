package test28701;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 5 || n > 100) return;
        int sum = 0, square = 0, cube = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
            cube += (int) Math.pow(i + 1, 3);
        }
        square = (int) Math.pow(sum, 2);

        System.out.println(sum);
        System.out.println(square);
        System.out.println(cube);
    }
}
