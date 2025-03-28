package test29731;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Meme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        if (caseNo < 1 || caseNo > 100) return;
        sc.nextLine();
        Set<String> memes = new HashSet<>(Arrays.asList("Never gonna give you up", "Never gonna let you down", "Never gonna run around and desert you", "Never gonna make you cry", "Never gonna say goodbye", "Never gonna tell a lie and hurt you", "Never gonna stop"));

        String result = "No";
        for (int i = 0; i < caseNo; i++) {
            if (!memes.contains(sc.nextLine())) {
                result = "Yes";
            }
        }
        System.out.println(result);
    }
}
