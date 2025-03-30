package test32326;

import java.util.Scanner;

public class ConveyorBeltSushi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int redCount = sc.nextInt();
    int greenCount = sc.nextInt();
    int blueCount = sc.nextInt();
    int totalCost = redCount * 3 + greenCount * 4 + blueCount * 5;
    System.out.println(totalCost);
  }
}
