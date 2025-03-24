package test20254;

import java.util.Scanner;

public class SiteScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] parts = line.split(" ");
        if (parts.length != 4) return;

        int regUniNo = Integer.parseInt(parts[0]);
        int regTeamNo = Integer.parseInt(parts[1]);
        int TopcUniNo = Integer.parseInt(parts[2]);
        int TopcTeamNo = Integer.parseInt(parts[3]);
        if (regUniNo < 0 || regTeamNo < 0 || regTeamNo > 120 || regUniNo > regTeamNo) return;
        if (TopcUniNo < 0 || TopcTeamNo < 0 || TopcTeamNo > 1000 || TopcUniNo > TopcTeamNo) return;

        int result = regUniNo * 56 + regTeamNo * 24 + TopcUniNo * 14 + TopcTeamNo * 6;
        System.out.println(result);
    }
}
