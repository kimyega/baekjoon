package test2475;

import java.util.Scanner;

public class Verification {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine().trim();
    String[] nums = line.split(" ");
    int sum = 0;
    for (String num : nums) {
      int intNum = Integer.parseInt(num);
      sum += intNum * intNum;
    }
    System.out.println(sum % 10);
  }
}
