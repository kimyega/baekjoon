package test32154;

import java.util.Scanner;

public class SUAPCWinter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rank = sc.nextInt();
    if (rank < 1 || rank > 10) return;
    rankByProblem(rank);
  }

  static void rankByProblem (int rank) {
    String[][] rankByProblems = {
            {"A", "B", "C", "D", "E", "F", "G", "H", "J", "L", "M"},
            {"A", "C", "E", "F", "G", "H", "I", "L", "M"},
            {"A", "B", "C", "E", "F", "G", "H", "L", "M"},
            {"A", "C", "E", "F", "G", "H", "L", "M"},
            {"A", "B", "C", "F", "G", "H", "L", "M"}
    };
    if (rank == 10) {
      System.out.println(rankByProblems[4].length);
      for (String problem : rankByProblems[4]) {
        System.out.print(problem + " ");
      }
    } else if (rank > 4) {
      System.out.println(rankByProblems[3].length);
      for (String problem : rankByProblems[3]) {
        System.out.print(problem + " ");
      }
    } else if (rank == 4) {
      System.out.println(rankByProblems[2].length);
      for (String problem : rankByProblems[2]) {
        System.out.print(problem + " ");
      }
    } else if (rank > 1) {
      System.out.println(rankByProblems[1].length);
      for (String problem : rankByProblems[1]) {
        System.out.print(problem + " ");
      }
    } else {
      System.out.println(rankByProblems[0].length);
      for (String problem : rankByProblems[0]) {
        System.out.print(problem + " ");
      }
    }
  }
}
