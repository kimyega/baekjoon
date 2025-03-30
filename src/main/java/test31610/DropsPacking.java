package test31610;

import java.util.Scanner;

public class DropsPacking {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int result = 0;
    for (int i = 0; i < 3; i++) {
      int num = sc.nextInt();
      if (num < 1 || num > 100) return;
      if (i == 1) {
        result *= num;
        continue;
      }
      result += num;
    }
    System.out.println(result);
  }
}
