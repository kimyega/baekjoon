package test27889;

import java.util.Scanner;

public class SchoolName {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    switch (sc.nextLine().trim()) {
      case "NLCS":
        System.out.println("North London Collegiate School"); break;
      case "BHA":
        System.out.println("Branksome Hall Asia"); break;
      case "KIS":
        System.out.println("Korea International School"); break;
      case "SJA":
        System.out.println("St. Johnsbury Academy"); break;
      default: break;
    }
  }
}
