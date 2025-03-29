package test31450;

import java.util.Scanner;

public class EveryoneWinner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int medals = sc.nextInt();
    int childNum = sc.nextInt();
    int max = (int) Math.pow(10, 9);
    if (medals < 1 || medals > max || childNum < 1 || childNum > max) return;

    if (medals % childNum != 0) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
