package test33178;

import java.util.Scanner;

public class Micromasters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int refStudents = sc.nextInt();
        if (refStudents < 0 || refStudents > 1000) return;

        int result = refStudents / 10;
        System.out.println(result);
    }
}
