package test28927;

import java.util.Scanner;

public class Movie {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int caseNo = 2;
    int maxTime = 0, melTime = 0;

    for (int i = 0; i < caseNo; i++) {
      String line = sc.nextLine();
      String[] parts = line.split(" ");
      int trailer = Integer.parseInt(parts[0]);
      int drama = Integer.parseInt(parts[1]);
      int movie = Integer.parseInt(parts[2]);
      if (trailer < 0 || trailer > 1000 || drama < 0 || drama > 1000 || movie < 0 || movie > 1000) return;
      int time = trailer * 3 + drama * 20 + movie * 120;
      if (i == 0) {
        maxTime = time;
      } else {
        melTime = time;
      }
    }

    String moreTimeSpent = maxTime == melTime ? "Draw" : (maxTime > melTime ? "Max" : "Mel");
    System.out.println(moreTimeSpent);
  }
}
