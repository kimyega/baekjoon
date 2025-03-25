package test3733;

import java.util.ArrayList;
import java.util.Scanner;

public class Shares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> resultList = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] parts = line.split(" ");
            if (parts.length != 2) break;

            int personNo = Integer.parseInt(parts[0]);
            int shareNo = Integer.parseInt(parts[1]);
            if (personNo < 1 || personNo > 10000 || shareNo < 1 || shareNo > Math.pow(10, 9)) break;

            int result = shareNo / (personNo + 1);
            resultList.add(result);
        }
        sc.close();

        for (Integer result : resultList) {
            System.out.println(result);
        }
    }
}
