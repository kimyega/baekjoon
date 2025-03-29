package test32951;

import java.util.Scanner;

public class AIUniversity {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if (year < 2024 || year > 9999) return;
    int yearsSince2024 = year - 2024;
    System.out.println(yearsSince2024);
  }
}
