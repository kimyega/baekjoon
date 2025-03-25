package test5341;

import java.util.ArrayList;
import java.util.Scanner;

public class Pyramids {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> results = new ArrayList<>();
    while (sc.hasNextInt()) {
      int n = sc.nextInt();
      if (n < 1) break;
      results.add(n * (n + 1) / 2);
    }
    for (int result : results) {
      System.out.println(result);
    }
  }
}
