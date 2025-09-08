package test29684;

import java.io.*;
import java.util.StringTokenizer;

public class WhichTeamShouldReceiveTheSponsorPrize {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cloSec = 2023;
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int min = Integer.MAX_VALUE, award = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int score = Integer.parseInt(st.nextToken());
                int diff = Math.abs(score - cloSec);
                if (diff < min) {
                    min = diff;
                    award = i;
                }
            }

            sb.append(award).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
