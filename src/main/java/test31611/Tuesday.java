package test31611;

import java.util.Scanner;

public class Tuesday {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nextDay = sc.nextInt();
    if (nextDay < 1 || nextDay > 100) return;

    boolean isTuesday = nextDay % 7 == 2;
    System.out.println(isTuesday ? 1 : 0);
  }
}
