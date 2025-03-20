package test15964;

import java.util.Scanner;

public class Strange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (1 <= a && a <= 1000 && 1 <= b && b <= 1000) {
      System.out.println((a + b) * (a - b));
    }

    sc.close();
  }
}
