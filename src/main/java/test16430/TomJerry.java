package test16430;

import java.util.Scanner;

public class TomJerry {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a < 1 || b < 1 || b > 9 || a >= b) return;
    int result = b - a;
    System.out.println(result + " " + b);

  }
}
