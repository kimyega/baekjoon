package test24568;

import java.util.Scanner;

public class CupCakeParty {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bigBox = sc.nextInt();
    int smallBox = sc.nextInt();
    if (bigBox < 0 || smallBox < 0) return;

    int result = bigBox * 8 + smallBox * 3 - 28;
    System.out.println(result);
    sc.close();
  }
}
