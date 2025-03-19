package test11022;

import java.util.ArrayList;
import java.util.Scanner;

public class Plus8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        sc.nextLine();
        ArrayList<String> results = new ArrayList<>();

        for (int i = 0; i < caseNo; i++) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] parts = line.split(" ");
            if (parts.length != 2) continue;

            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            String result = "Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b);
            results.add(result);
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}
