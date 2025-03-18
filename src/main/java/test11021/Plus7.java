package test11021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plus7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < caseNo; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            if (a < 0 || a > 10 || b < 0 || b > 10) {
                return;
            }
            list.add(sum);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Case #" + (i + 1) + ": " + list.get(i));
        }
    }
}
