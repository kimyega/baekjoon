package test1008;

import java.util.Scanner;

public class Division {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()) {
      int a = sc.nextInt();
      if (a <= 0){
        break;
      }
      int b = sc.nextInt();
      if (b >= 10){
        break;
      }
      double result = (double) a / b;
      System.out.println(result);
    }
  }
}
