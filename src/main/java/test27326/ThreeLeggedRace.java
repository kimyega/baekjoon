package test27326;

import java.io.*;
import java.util.StringTokenizer;

public class ThreeLeggedRace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] teams = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2 * n - 1; i++) {
            int teamNo = Integer.parseInt(st.nextToken());
            teams[teamNo - 1]++;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            int team = teams[i];
            if (team == 1) res = i + 1;
        }

        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
