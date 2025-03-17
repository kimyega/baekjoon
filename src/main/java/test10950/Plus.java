package test10950;

import java.util.Scanner;

public class Plus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int caseNo = sc.nextInt();
    int k = 0;
    int[] results = new int[caseNo];
    while (caseNo > k) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a < 0 || b > 10) {
        return;
      }
      int result = a + b;
      results[k] = result;
      k++;
    }
    for (int result : results) {
      System.out.println(result);
    }
  }
}
