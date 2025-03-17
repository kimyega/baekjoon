package test10430;

import java.util.Arrays;
import java.util.Scanner;

public class Remainder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    int result1 = (a + b) % c, result2 = ((a % c) + (b % c)) % c, result3 = (a * b) % c, result4 = ((a % c) * (b % c)) % c;

    if (Arrays.stream(new int[]{a, b, c}).allMatch(x -> x >= 2 && x <= 10000)) {
      System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4);
    } else {
      return;
    }
  }
}
