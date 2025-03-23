package test13277;

import java.math.BigInteger;
import java.util.Scanner;

public class Big {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger a = new BigInteger(sc.next());
    BigInteger b = new BigInteger(sc.next());

    int ifAMin = a.compareTo(BigInteger.ZERO);
    int ifAMax = a.compareTo(BigInteger.TEN.pow(300000));
    int ifBMin = b.compareTo(BigInteger.ZERO);
    int ifBMax = b.compareTo(BigInteger.TEN.pow(300000));
    if (ifAMin < 0 || ifAMax > 0 || ifBMin < 0 || ifBMax > 0) return;

    BigInteger multiply = a.multiply(b);
    System.out.println(multiply);
  }
}
