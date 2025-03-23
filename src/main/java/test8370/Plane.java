package test8370;

import java.util.Scanner;

public class Plane {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine().trim();
    String[] parts = line.split(" ");
    if (parts.length != 4) return;

    int result = 0, multifly = 0;
    for (int i = 0; i < parts.length; i++) {
      int part = Integer.parseInt(parts[i]);
      if (part < 1 || part > 1000) {
        return;
      } else if ((i + 1) % 2 == 1) {
        multifly = part;
      } else {
        multifly *= part;
        result += multifly;
      }
    }
    System.out.println(result);
  }
}
