package test8545;

import java.util.Scanner;

public class Zadanie {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    if (str.length() != 3) return;
    String reversed = new StringBuilder(str).reverse().toString();
    System.out.println(reversed);
  }
}
