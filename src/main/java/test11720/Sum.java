package test11720;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        if (caseNo < 1 || caseNo > 100) return;
        sc.nextLine();

        String numStr = sc.nextLine().trim();
        if (numStr.length() != caseNo) return;
        String[] parts = numStr.split("");

        int sum = 0;
        for (String part : parts ) {
            int num = Integer.parseInt(part);
            sum += num;
        }
        System.out.println(sum);
    }
}
