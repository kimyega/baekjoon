package test3009;

import java.util.Scanner;

public class FourthPointCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x1 = sc.nextInt(), y1 = sc.nextInt();
    int x2 = sc.nextInt(), y2 = sc.nextInt();
    int x3 = sc.nextInt(), y3 = sc.nextInt();

    int uniqueX = (x1 == x2) ? x3 : (x1 == x3 ? x2 : x1);
    int uniqueY = (y1 == y2) ? y3 : (y1 == y3 ? y2 : y1);

    System.out.println(uniqueX + " " + uniqueY);
  }
}
