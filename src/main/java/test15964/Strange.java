package test15964;

import java.util.Scanner;

public class Strange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();

    if (a < 1 || a > 100000 || b < 1 || b > 100000) return;

    System.out.println((a + b) * (a - b));

  }
}
