package test32384;

import java.util.Scanner;

public class LoveKorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 1 || num > 10) return;
        for (int i = 0; i < num; i++) {
            System.out.print("LoveisKoreaUniversity ");
        }
    }
}
