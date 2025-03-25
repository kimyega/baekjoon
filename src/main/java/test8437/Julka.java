package test8437;

import java.math.BigInteger;
import java.util.Scanner;

public class Julka {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger appleCount = sc.nextBigInteger();
    BigInteger moreCount = sc.nextBigInteger();

    int isMinApple = appleCount.compareTo(BigInteger.TWO);
    int isMaxApple = appleCount.compareTo(BigInteger.TEN.pow(100));
    int isMinMore = moreCount.compareTo(BigInteger.TWO);
    int isAppleMore = appleCount.compareTo(moreCount);
    if (isMinApple < 0 || isMaxApple > 0 || isMinMore < 0 || isAppleMore < 0) return;

    BigInteger lessGirl = appleCount.subtract(moreCount).divide(BigInteger.TWO);
    System.out.println(lessGirl.add(moreCount));
    System.out.println(lessGirl);
  }
}
