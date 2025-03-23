package test15963;

import java.util.Scanner;

public class Casio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine().trim();
    String[] parts = line.split(" ");
    if (parts.length != 2) return;
    if (parts[0].length() > 10 || parts[1].length() > 10) return;

    long n = Long.parseLong(parts[0]);
    long m = Long.parseLong(parts[1]);

    if (n == m) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

  }
}
