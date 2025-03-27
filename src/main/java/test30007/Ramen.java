package test30007;

import java.util.ArrayList;
import java.util.Scanner;

public class Ramen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ramenBoilCount = sc.nextInt();
        if (ramenBoilCount < 1 || ramenBoilCount > 100) return;
        sc.nextLine();

        ArrayList<Integer> requiredWaters = new ArrayList<>();
        for (int i = 0; i < ramenBoilCount; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");
            if (parts.length != 3) return;

            int ramenCoefficient = Integer.parseInt(parts[0]);
            int baseWaterAmount = Integer.parseInt(parts[1]);
            int ramenCount = Integer.parseInt(parts[2]);
            if (ramenCoefficient < 100 || ramenCoefficient > 1000 || baseWaterAmount < 100 || baseWaterAmount > 1000 || ramenCount < 1 || ramenCount > 100) return;

            int requiredWaterAmount = ramenCoefficient * (ramenCount - 1) + baseWaterAmount;
            requiredWaters.add(requiredWaterAmount);
        }

        for (int requiredWaterAmount : requiredWaters) {
            System.out.println(requiredWaterAmount);
        }
    }
}
