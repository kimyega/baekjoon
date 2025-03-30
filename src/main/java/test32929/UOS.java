package test32929;

import java.util.Scanner;

public class UOS {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n < 1 || n > Math.pow(10, 9)) return;

    switch (n % 3) {
      case 0: System.out.println("S"); break;
      case 1: System.out.println("U"); break;
      case 2: System.out.println("O"); break;
    }
  }
}
