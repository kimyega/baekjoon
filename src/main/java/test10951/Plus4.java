package test10951;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plus4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(true){
            if (!sc.hasNextInt()) {
                break;
            }
            int a = sc.nextInt();
            if (!sc.hasNextInt()) {
                break;
            }
            int b = sc.nextInt();
            if (a <= 0 || a > 10 || b <= 0 || b > 10) {
                break;
            }
            list.add(a + b);
        }
        for (int n : list) {
            System.out.println(n);
        }
        sc.close();
    }
}
