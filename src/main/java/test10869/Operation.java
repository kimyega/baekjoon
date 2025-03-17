package test10869;

import java.util.Scanner;

public class Operation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()) {
      int a = sc.nextInt();
      if (a < 1 || a > 10000){
        break;
      }
      int b = sc.nextInt();
      if (b < 1 || b > 10000){
        break;
      }
      int addition = a + b;
      int subtraction = a - b;
      int multiply = a * b;
      int division = a / b;
      int balance = a % b;
      System.out.println(addition);
      System.out.println(subtraction);
      System.out.println(multiply);
      System.out.println(division);
      System.out.println(balance);

  }
  }
}
