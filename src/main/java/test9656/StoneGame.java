package test9656;

import java.io.*;

public class StoneGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        boolean[] dp = new boolean[1001];

        dp[1] = false;
        dp[2] = true;
        dp[3] = false;
        dp[4] = true;

        for (int i = 5; i <= n; i++) {

            if (!dp[i - 1] || !dp[i - 3]) {
                dp[i] = true;
            } else {
                dp[i] = false;
            }
        }

        String res = dp[n] ? "SK" : "CY";
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
