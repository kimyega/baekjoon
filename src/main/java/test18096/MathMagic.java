package test18096;

import java.util.Scanner;

public class MathMagic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n < 0 || n > 1000) return;
    int result = (int) Math.pow(1, n);
    System.out.println(result);
  }
}
