package test32314;

import java.util.Scanner;

public class ChristmasTreeAdapter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ampere = sc.nextInt();
        if (ampere < 0 || ampere > 20) return;
        sc.nextLine();

        String line = sc.nextLine().trim();
        String[] parts = line.split(" ");
        if (parts.length != 2) return;

        int watt = Integer.parseInt(parts[0]);
        int volt = Integer.parseInt(parts[1]);
        if (watt < 0 || watt > 2000 || volt < 0 || volt > 100 || watt % volt != 0) return;

        int adapterAmpere = watt / volt;
        if (adapterAmpere < ampere) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
