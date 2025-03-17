package test10998;

import java.util.Scanner;

public class Multiply {
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
      System.out.println(a * b);
    }
  }
}
