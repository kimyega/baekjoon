package test27434;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0 || num > 100000) return;

        System.out.println(factorial(num));
    }

    public static BigInteger factorial(int n) {
        if (n == 0 || n == 1) return BigInteger.ONE;
        return factorialDivideAndConquer(1, n);
    }

    private static BigInteger factorialDivideAndConquer(int start, int end) {
        if (start > end) return BigInteger.ONE;
        if (start == end) return BigInteger.valueOf(start);
        if (end - start == 1) return BigInteger.valueOf(start).multiply(BigInteger.valueOf(end));

        int mid = (start + end) / 2;
        return factorialDivideAndConquer(start, mid).multiply(factorialDivideAndConquer(mid + 1, end));
    }
}
