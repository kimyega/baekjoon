package test2739;

import java.util.Scanner;

public class Gugudan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dan = sc.nextInt();
    if (dan < 1 || dan > 9) {
      return;
    }
    for (int i = 0; i < 9; i++) {
      System.out.println(dan + " * " + (i + 1) + " = " + dan * (i + 1));
    }
  }
}
