package test14928;

import java.math.BigInteger;
import java.util.Scanner;

public class Big {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String bigStr = sc.nextLine();

    // 문자열 길이가 1,000,000보다 크면 바로 종료
    if (bigStr.length() > 1000000) return;

    BigInteger likeNo = new BigInteger("20000303");
    BigInteger remainder = BigInteger.ZERO;

    // 각 자릿수에 대해 나머지 계산
    for (int i = 0; i < bigStr.length(); i++) {
      char digit = bigStr.charAt(i);
      BigInteger digitValue = new BigInteger(String.valueOf(digit));
      System.out.println("digitValue : " + digitValue);

      // 나머지 계산
      remainder = remainder.multiply(BigInteger.TEN).add(digitValue).remainder(likeNo);
      System.out.println("remainder : " + remainder);
    }

    System.out.println(remainder);
    sc.close();
  }
}
