package test23235;

import java.util.Scanner;

public class ShortingAlgorithm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int caseNo = 0;
    while (sc.hasNextLine()) {
      String line = sc.nextLine().trim();
      String[] parts = line.split(" ");
      int testCaseNo = Integer.parseInt(parts[0]);
      if (testCaseNo < 1) break;
      if (parts.length != testCaseNo + 1) return;
      caseNo++;
    }
    for (int i = 0; i < caseNo; i++) {
      System.out.println("Case " + (i + 1) + ": Sorting... done!");
    }
  }
}
