package test10952;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            if (a < 0 || a > 10 || b < 0 || b > 10) {
                return;
            } else if (a == 0 && b == 0) {
                for (Integer n : list) {
                    System.out.println(n);
                }
                return;
            }
            list.add(sum);
        }


    }
}
