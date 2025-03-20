package test27323;

import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a < 0 || a > 100) return;
    int b = sc.nextInt();
    if (b < 0 || b > 100) return;
    System.out.println(a * b);


  }
}
