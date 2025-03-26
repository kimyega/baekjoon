package test29751;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        if (width < 1 || width > 100 || height < 1 || height > 100) return;
        double result = (double) width * height / 2;
        System.out.printf("%.1f\n", result);
    }
}
