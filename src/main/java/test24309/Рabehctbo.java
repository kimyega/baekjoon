package test24309;

import java.math.BigInteger;
import java.util.Scanner;

public class Рabehctbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();

        BigInteger maxB = BigInteger.TEN.pow(100);
        BigInteger maxA = BigInteger.TEN.pow(17);
        BigInteger zero = BigInteger.ZERO;
        if (a.compareTo(zero) <= 0 || a.compareTo(maxA) > 0 || c.compareTo(zero) <= 0 || c.compareTo(b) >= 0 || b.compareTo(maxB) > 0) return;

        BigInteger subtracts = b.subtract(c);

        if (!subtracts.mod(a).equals(BigInteger.ZERO)) return;
        BigInteger x = subtracts.divide(a);
        if (x.compareTo(zero) <= 0) return;
        System.out.println(x);
    }
}
