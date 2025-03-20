package test5522;

import java.util.Scanner;

public class CardGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int result = 0;
    for (int i = 0; i < 5; i++) {
      int score = sc.nextInt();
      if (score < 0 || score > 100) {
        break;
      }
      result += score;
    }
    System.out.println(result);
  }
}
