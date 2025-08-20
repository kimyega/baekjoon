package test21022;

import java.io.*;
import java.util.StringTokenizer;

public class ThreePointsForAWin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());

        int score = 0;

        while (stA.hasMoreTokens() && stB.hasMoreTokens()) {
            int a = Integer.parseInt(stA.nextToken());
            int b = Integer.parseInt(stB.nextToken());

            score += a > b ? 3 : a < b ? 0 : 1;
        }

        bw.write(score + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
