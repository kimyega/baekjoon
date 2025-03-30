package test28938;

import java.util.Scanner;

public class Conveyor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pressCount = sc.nextInt();
    if (pressCount < 1 || pressCount > 1000) return;
    sc.nextLine();

    String line = sc.nextLine().trim();
    String[] parts = line.split(" ");
    if (parts.length != pressCount) return;

    int result = 0;
    for (String part : parts) {
      int move = Integer.parseInt(part);
      if (move < -1 || move > 1) return;
      result += move;
    }

    int getSign = Integer.compare(result, 0);
    switch (getSign) {
      case -1:  System.out.println("Left");   break;
      case 0:   System.out.println("Stay");   break;
      case 1:   System.out.println("Right");  break;
    }
  }
}
