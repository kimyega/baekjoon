package test31429;

import java.util.Scanner;

public class SuapcSummer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rank = sc.nextInt();
    if (rank < 1 || rank > 11) return;

    int[][] rankByData = {
            {12, 1600},
            {11, 894},
            {11, 1327},
            {10, 1311},
            {9, 1004},
            {9, 1178},
            {9, 1357},
            {8, 837},
            {7, 1055},
            {6, 556},
            {6, 773}
    };

    int task = rankByData[rank - 1][0];
    int penalty = rankByData[rank - 1][1];
    System.out.println(task + " " + penalty);
  }
}
