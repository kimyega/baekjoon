package test2438;

import java.util.Scanner;

public class Star1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int starNo = sc.nextInt();
    if (starNo < 1 || starNo > 100) {
      return;
    }
    for (int i = 0; i < starNo; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
