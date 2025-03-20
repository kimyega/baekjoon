package test10757;

import java.math.BigInteger;
import java.util.Scanner;

public class PlusBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        int tenThousand = 10000;
        BigInteger max = BigInteger.TEN.pow(tenThousand);
        BigInteger min = BigInteger.ZERO;
        if (a.compareTo(min) < 0 || a.compareTo(max) > 0 || b.compareTo(min) < 0 || b.compareTo(max) > 0) {
            return;
        }
        BigInteger sum = a.add(b);
        System.out.println(sum);
    }
}
