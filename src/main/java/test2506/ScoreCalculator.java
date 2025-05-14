package test2506;

import java.io.*;
import java.util.StringTokenizer;

public class ScoreCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = 0, pre = 0, stack = 0;
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                score++;

                if (pre == 1) {
                    stack++;
                    score += stack;
                } else {
                    stack = 0;
                }
            }

            pre = num;
        }

        bw.write(score + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
