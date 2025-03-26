package test26711;

import java.math.BigInteger;
import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aStr = sc.nextLine();
        String bStr = sc.nextLine();
        if (aStr.length() > 5000 || bStr.length() > 5000) return;

        BigInteger a = new BigInteger(aStr);
        BigInteger b = new BigInteger(bStr);

        System.out.println(a.add(b));

    }
}
