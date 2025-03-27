package test26545;

import java.util.Scanner;

public class Mathematics {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int caseNo = sc.nextInt();
    if(caseNo < 1) return;
    int sum = 0;

    for (int i = 0; i < caseNo; i++) {
      int num = sc.nextInt();
      sum += num;
    }
    System.out.println(sum);
  }
}
