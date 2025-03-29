package test29163;

import java.util.Scanner;

public class MrBeen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numCount = sc.nextInt();
    if (numCount < 1 || numCount > 1000) return;
    sc.nextLine();

    String line = sc.nextLine().trim();
    String[] parts = line.split(" ");
    int evenCount = 0, oddCount = 0;
    for (int i = 0; i < numCount; i++) {
      int num = Integer.parseInt(parts[i]);
      if (num < 1 || num > Math.pow(10, 9)) return;
      if (num % 2 == 0) evenCount++;
      else oddCount++;
    }

    if (evenCount > oddCount) System.out.println("Happy");
    else System.out.println("Sad");
  }
}
