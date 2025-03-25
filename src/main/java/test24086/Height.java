package test24086;

import java.util.Scanner;

public class Height {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int prevHeight = sc.nextInt();
    int currHeight = sc.nextInt();
    if (prevHeight < 100 || currHeight < 100 || currHeight > 200 || prevHeight > currHeight) return;

    int resultHeight = currHeight - prevHeight;
    System.out.println(resultHeight);
    sc.close();
  }
}
