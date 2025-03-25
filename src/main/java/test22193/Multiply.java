package test22193;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Multiply {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    sc.nextLine();
    if (n < 1 || n > 50000 || m < 1 || m > 50000) return;

    String aStr = sc.nextLine();
    String bStr = sc.nextLine();
    String aRegex = "^\\d{" + n + "}$";
    String bRegex = "^\\d{" + m + "}$";

    Pattern aPattern = Pattern.compile(aRegex);
    Matcher aMatcher = aPattern.matcher(aStr);
    Pattern bPattern = Pattern.compile(bRegex);
    Matcher bMatcher = bPattern.matcher(bStr);

    if (!aMatcher.matches() || !bMatcher.matches()) return;
    BigInteger a = new BigInteger(aStr);
    BigInteger b = new BigInteger(bStr);
    System.out.println(a.multiply(b));
  }
}
