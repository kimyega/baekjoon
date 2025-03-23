package test15740;

import java.math.BigInteger;
import java.util.Scanner;

public class Plus9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger a = sc.nextBigInteger();
    BigInteger b = sc.nextBigInteger();

    BigInteger tenthous = BigInteger.TEN.pow(10000);
    int ifAMax = a.compareTo(tenthous);
    int ifAMin = a.compareTo(tenthous.negate());
    int ifBMax = b.compareTo(tenthous);
    int ifBMin = b.compareTo(tenthous.negate());
    if (ifAMin < 0 || ifAMax > 0 || ifBMin < 0 || ifBMax > 0) return;

    BigInteger sum = a.add(b);
    System.out.println(sum);
  }
}
