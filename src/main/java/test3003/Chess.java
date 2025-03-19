package test3003;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] parts = line.split(" ");
        if (parts.length != 6) {
            return;
        }
        String resultString = "";
        for (int i = 0; i < parts.length; i++) {
            int result;
            int partInt = Integer.parseInt(parts[i]);
            if (partInt < 0 || partInt > 10) {
               return;
            }
            if (i == 0 || i ==1) {
                result = 1 - partInt;
            } else if (i == 2 || i == 3 || i == 4) {
                result = 2 - partInt;
            } else {
                result = 8 - partInt;
            }
            resultString += result + " ";
        }
        System.out.println(resultString);
    }
}
