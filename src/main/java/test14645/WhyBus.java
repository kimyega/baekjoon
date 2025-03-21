package test14645;

import java.util.Scanner;

public class WhyBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "비와이";
        String firstLine =  sc.nextLine().trim();
        String[] firstLineSplit = firstLine.split(" ");

        int stationCount = Integer.parseInt(firstLineSplit[0]);
        if (stationCount < 1 || stationCount > 100000) return;

        int personCount = Integer.parseInt(firstLineSplit[1]);
        if (personCount < 1 || personCount > 10000) return;

        for (int i = 0; i < stationCount; i++) {
            String line = sc.nextLine().trim();
            String[] lineSplit = line.split(" ");

            int boardingCount = Integer.parseInt(lineSplit[0]);
            if (boardingCount < 0 || boardingCount > 10000) break;
            personCount += boardingCount;

            int alightingCount = Integer.parseInt(lineSplit[1]);
            if (alightingCount < 0 || alightingCount > 10000 || alightingCount > personCount) break;
            personCount -= alightingCount;

            if (i == stationCount - 1) {
                System.out.println(name);
                break;
            }
        }

    }
}
