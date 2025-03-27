package test26574;

import java.util.Scanner;

public class Copy {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int caseNo = sc.nextInt();
    if (caseNo < 1) return;

    int[] nums = new int[caseNo];
    for (int i = 0; i < caseNo; i++) {
      int num = sc.nextInt();
      nums[i] = num;
    }
    for (int num : nums) {
      System.out.println(num + " " + num);
    }
  }
}
