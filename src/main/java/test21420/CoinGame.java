package test21420;

import java.io.*;

public class CoinGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] coins = new int[2];

        while (n-- > 0) {
            coins[Integer.parseInt(br.readLine())]++;
        }

        bw.write(Math.min(coins[0], coins[1]) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
