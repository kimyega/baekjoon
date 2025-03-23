package test15727;

import java.util.Scanner;

public class Disappeared {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double length = sc.nextInt();
    int million = 1000000;
    if (length < 1 || length > million) return;
    int result = (int) Math.ceil(length / 5);
    System.out.println(result);
  }
}
