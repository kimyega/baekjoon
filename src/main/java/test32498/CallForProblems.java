package test32498;

import java.util.Scanner;

public class CallForProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        if (caseNo < 1 || caseNo > 50) return;

        int isOdd = 0;
        for (int i = 0; i < caseNo; i++) {
            int cases = sc.nextInt();
            if (cases < 0 || cases > 100) return;

            if (cases % 2 == 1) isOdd++;
        }
        System.out.println(isOdd);
    }
}
