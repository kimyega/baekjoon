package test31606;

import java.util.Scanner;

public class Fruit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int apple = sc.nextInt();
    int mandarin = sc.nextInt();
    if (apple < 0 || apple > 100 || mandarin < 0 || mandarin > 100) return;

    int banana = 3;
    int fruit = apple + mandarin + banana;
    System.out.println(fruit);
  }
}
