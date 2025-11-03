package test34553;

import java.io.*;

public class AlphabetScoreCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        int score = 1, stack = 0;

        char prev = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c > prev) stack++;
            else stack = 0;

            score += 1 + stack;
            prev = c;
        }

        bw.write(score + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
