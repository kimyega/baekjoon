package test1002;

import java.util.ArrayList;
import java.util.Scanner;

public class Turret {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int caseNo = sc.nextInt();
    int[] con = new int[caseNo];
    for (int i = 0; i < caseNo; i++) {
      ArrayList<Integer> number = new ArrayList<>();
      for (int k = 0; k < 6; k++) {
        number.add(sc.nextInt());
      }
      int x1 = number.get(0);
      int y1 = number.get(1);
      int r1 = number.get(2);
      int x2 = number.get(3);
      int y2 = number.get(4);
      int r2 = number.get(5);
      double distance = getDistance(x1, y1, x2, y2);
      //    Math.abs() 절댓값
      int difference = Math.abs(r1 - r2);
      int sum = r1 + r2;
      if (difference < distance && distance < sum) {
        con[i] = 2;
      } else if (x1 == x2 && y1 == y2 && r1 == r2) {
        con[i] = -1;
      } else if (sum == distance || difference == distance) {
        con[i] = 1;
      } else {
        con[i] = 0;
      }
    }
    for (int i = 0; i < caseNo; i++) {
      System.out.println(con[i]);
    }
  }
  static double getDistance(int x1, int y1, int x2, int y2) {
    //      Math.pow() 제곱
    //      Math.sqrt() 루트
    double d;
    int xd, yd;
    yd = (int) Math.pow((y1 - y2), 2);
    xd = (int) Math.pow((x1 - x2), 2);
    d = Math.sqrt(yd + xd);
    return d;
  }
}
