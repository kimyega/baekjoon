package test15964;

import java.util.Scanner;

public class Strange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a < 1 || a > 1000 || b < 1 || b > 1000) return;

    System.out.println((a + b) * (a - b));

  }
}
