package test8871;

import java.util.Scanner;

public class ContestExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 1000) return;
        int min = (n + 1) * 2;
        int max = (n + 1) * 3;
        System.out.println(min + " " + max);
    }
}
