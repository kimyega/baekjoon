package test1271;

import java.math.BigInteger;
import java.util.Scanner;

public class Rich {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger money = sc.nextBigInteger();
    BigInteger creatureNo = sc.nextBigInteger();

    BigInteger limit = BigInteger.TEN.pow(1000);

    if (!isValidCondition(money, creatureNo, limit)) return;
    System.out.println(money.divide(creatureNo));
    System.out.println(money.mod(creatureNo));
  }

  public static boolean isValidCondition (BigInteger money, BigInteger creatureNo, BigInteger limit) {
    BigInteger zero = BigInteger.ZERO;
    BigInteger ten = BigInteger.ONE;
    return money.compareTo(creatureNo) >= 0 && money.compareTo(limit) <= 0 && creatureNo.compareTo(money) <= 0 && money.mod(ten).equals(zero) && creatureNo.mod(ten).equals(zero);
  }
}
