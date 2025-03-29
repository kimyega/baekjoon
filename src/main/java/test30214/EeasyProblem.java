package test30214;

import java.util.Scanner;

public class EeasyProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int preSolvedNum = sc.nextInt();
    int endSolvedNum = sc.nextInt();
    if (preSolvedNum < 0 || preSolvedNum > endSolvedNum || endSolvedNum < 1 || endSolvedNum > 100) return;

    if (endSolvedNum <= preSolvedNum * 2) {
      System.out.println("E");
    } else {
      System.out.println("H");
    }
  }
}
