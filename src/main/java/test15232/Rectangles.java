package test15232;

import java.util.Scanner;

public class Rectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNo = sc.nextInt();
        int starNo = sc.nextInt();
        if (lineNo < 1 || lineNo > 20 || starNo < 1 || starNo > 20) return;

        for (int i = 0; i < lineNo; i++) {
            for (int j = 0; j < starNo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
