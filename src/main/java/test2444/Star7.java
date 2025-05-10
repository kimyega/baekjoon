package test2444;

import java.util.Scanner;

public class Star7 {
  public static void main(String[] args) {
    String st = "*";
    String bl = " ";

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i < n * 2; i++) {
      if (i <= n) {
        System.out.print(bl.repeat(n - i));
        System.out.print(st.repeat(i * 2 - 1));
      } else {
        System.out.print(bl.repeat(i - n));
        System.out.print(st.repeat(n * 4 - 1 - i * 2));
      }

      System.out.println();
    }
  }
}
