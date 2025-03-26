package test26082;

import java.util.Scanner;

public class Warboy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] parts = line.split(" ");
        int compPrice = 0, compPerf = 0, worboyPrice = 0, worboyPerf = 0;

        for (int i = 0; i < parts.length; i++) {
            int part = Integer.parseInt(parts[i]);
            if (part < 1 || part > 1000) return;
            if (i == 0) {
                compPrice = part;
            } else if (i == 1) {
                compPerf = part;
            } else {
                worboyPrice = part;
            }
        }
        if (compPerf % compPrice != 0) return;
        worboyPerf = compPerf / compPrice * 3 * worboyPrice;
        System.out.println(worboyPerf);
    }
}
