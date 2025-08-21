package test9443;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ArrangementOfContest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Set<Character> letters = new HashSet<>();

        while (n-- > 0) {
            char letter = br.readLine().charAt(0);
            letters.add(letter);
        }

        int maxCount = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            if (letters.contains(c)) maxCount++;
            else break;
        }

        bw.write(maxCount + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
