package test24736;

import java.util.Scanner;

public class FootballScoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String awayStr = sc.nextLine().trim();
        String homeStr = sc.nextLine().trim();

        int awayScore = Scoring(awayStr);
        int homeScore = Scoring(homeStr);
        if (awayScore < 0 || homeScore < 0) return;

        System.out.println(awayScore + " " + homeScore);
    }

    public static int Scoring(String teamStr) {
        String[] teamParts = teamStr.split(" ");
        if (teamParts.length != 5) return -1;

        int t = Integer.parseInt(teamParts[0]);
        int p = Integer.parseInt(teamParts[3]);
        int c = Integer.parseInt(teamParts[4]);
        if (p + c > t) return -1;

        int result = 0;
        for (int i = 0; i < teamParts.length; i++) {
            int score = Integer.parseInt(teamParts[i]);
            if (score < 0 || score > 10) return -1;
            switch (i) {
                case 0: result += score * 6; break;
                case 1: result += score * 3; break;
                case 2: case 4: result += score * 2; break;
                case 3: result += score; break;
                default: break;
            }
        }
        return result;
    }
}
