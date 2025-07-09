package test9161;

import java.io.*;

public class SirBedaveresBogusDivisionSolutions {
  public static void main(String[] args) throws IOException {
    for (int numerator = 100; numerator <= 999; numerator++) {
      for (int denominator = numerator + 1; denominator <= 999; denominator++) {
        String a = Integer.toString(numerator);
        String b = Integer.toString(denominator);

        if (a.charAt(2) == b.charAt(0)) {
          String aShort = a.substring(0, 2); // 앞 두 자리
          String bShort = b.substring(1);    // 뒤 두 자리

          if (a.equals(b)) continue;

          int a1 = Integer.parseInt(a);
          int b1 = Integer.parseInt(b);
          int a2 = Integer.parseInt(aShort);
          int b2 = Integer.parseInt(bShort);

          if (b2 == 0) continue;

          if (a1 * b2 == a2 * b1) {
            System.out.printf("%d / %d = %d / %d\n", a1, b1, a2, b2);
          }
        }
      }
    }
  }
}
