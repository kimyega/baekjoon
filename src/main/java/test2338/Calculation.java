package test2338;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aStr = sc.nextLine();
        if (aStr.length() > 1001) return;
        BigInteger a = new BigInteger(aStr);
        String bStr = sc.nextLine();
        if (bStr.length() > 1001) return;
        BigInteger b = new BigInteger(bStr);

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));

    }
}
