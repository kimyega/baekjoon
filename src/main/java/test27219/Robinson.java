package test27219;

import java.util.Scanner;

public class Robinson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        if (days < 1 || days > 10000) return;
        String fiveRome = "V".repeat(days / 5);
        String oneRome = "I".repeat(days % 5);
        System.out.println(fiveRome + oneRome);
    }
}
