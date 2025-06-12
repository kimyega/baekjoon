package test16785;

import java.io.*;
import java.util.StringTokenizer;

public class SocialGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int days = 0, coins = 0;

        while (coins < c) {
            days++;
            coins += a;
            if (days % 7 == 0) coins += b;
        }

        bw.write(days + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
