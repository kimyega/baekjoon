package test30664;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoteriaFalha {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<BigInteger> lotteries = new ArrayList<BigInteger>();
    while (sc.hasNextBigInteger()) {
      BigInteger num = sc.nextBigInteger();
      if (num.equals(BigInteger.ZERO)) break;
      if (num.compareTo(BigInteger.ZERO) < 0 || num.compareTo(BigInteger.TEN.pow(30)) > 0) return;
      lotteries.add(num);
    }
    for (BigInteger lotter : lotteries) {
      if (lotter.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO)) {
        System.out.println("PREMIADO");
      } else {
        System.out.println("TENTE NOVAMENTE");
      }
    }
  }
}
