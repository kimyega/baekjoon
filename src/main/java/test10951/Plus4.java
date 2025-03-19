package test10951;

import java.util.ArrayList;
import java.util.Scanner;

public class Plus4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;

            String[] parts = line.split(" ");
            if (parts.length != 2) continue;

            try {
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);
                results.add(a + b);
            } catch (NumberFormatException e) {
            }
        }

        sc.close();

        for (int result : results) {
            System.out.println(result);
        }
    }
}
