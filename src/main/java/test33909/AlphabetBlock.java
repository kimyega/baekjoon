package test33909;

import java.util.Scanner;

public class AlphabetBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long C = sc.nextLong();
        long O = sc.nextLong();
        long N = sc.nextLong();
        sc.close();

        C += O * 2;  // O → C 변환
        N += S;      // S → N 변환

        long maxBoxes = Math.min(N / 3, C / 6); // 상자 1개 단위
        System.out.println(maxBoxes);
    }
}

