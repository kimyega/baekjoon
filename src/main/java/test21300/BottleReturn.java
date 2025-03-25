package test21300;

import java.util.Scanner;

public class BottleReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] bottles = line.split(" ");
        int resultCents = 0;
        for (String bottle : bottles) {
            resultCents += Integer.parseInt(bottle) * 5;
        }
        System.out.println(resultCents);
    }
}
