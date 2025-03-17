package test18236;

import java.util.ArrayList;
import java.util.Scanner;

public class Procession2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        ArrayList<int[]> number = new ArrayList<>();
        for (int i = 0; i < caseNo; i++) {
            for (int k = 0; k < 2; k++) {
                int[] num = new int[2];
                num[i] = sc.nextInt();
                number.add(num);
            }
        }
        // A

    }
}
