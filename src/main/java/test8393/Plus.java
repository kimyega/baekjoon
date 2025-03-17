package test8393;

import java.util.Scanner;

public class Plus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n < 1 || n > 10000) {
      return;
    }
    int result = n * (n + 1) / 2;
    System.out.println(result);
  }
}
