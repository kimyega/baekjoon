package test32775;

import java.util.Scanner;

public class FourHours {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int trainTime = sc.nextInt();
    int planeTime = sc.nextInt();
    if (trainTime < 1 || trainTime > 738 || planeTime < 1 || planeTime > 738) return;

    if (trainTime > planeTime) {
      System.out.println("flight");
    } else {
      System.out.println("high speed rail");
    }
  }
}
