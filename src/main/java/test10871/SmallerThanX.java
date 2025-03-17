package test10871;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallerThanX {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int x = sc.nextInt();
    if (num < 1 || num > 10000 || x < 1 || x > 10000) {
      return;
    }
     List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < num; i++) {
      int number = sc.nextInt();
      if(number < x) {
        numbers.add(number);
      }
    }
    for (int result : numbers) {
      System.out.print(result + " ");
    }
  }
}
