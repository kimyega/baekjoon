package test10807;

import java.util.Scanner;

public class IntCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intNo = sc.nextInt();
        if (intNo < 0 || intNo > 100) {
            return;
        }
        sc.nextLine();


        String line = sc.nextLine().trim();
        if (line.isEmpty()) return;
        String[] parts = line.split(" ");
        if (parts.length != intNo) return;

        int findNo = sc.nextInt();
        if (findNo < -100 || findNo > 100) {
            return;
        }
        int count = 0;
        for(String part : parts) {
            int matchNo = Integer.parseInt(part);
            if (matchNo == findNo) {
                count++;
            }
        }
        System.out.println(count);
    }
}
