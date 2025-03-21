package test5717;

import java.util.ArrayList;
import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();
        while (true) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            if (a == 0 && b == 0) {
                for (Integer result : results) {
                    System.out.println(result);
                }
            }
            if (a < 1 || a > 5 || b < 1 || b > 5) break;

            int result = a + b;
            results.add(result);
        }
    }
}
