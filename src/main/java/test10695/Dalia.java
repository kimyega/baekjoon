package test10695;

import java.io.*;
import java.util.StringTokenizer;

public class Dalia {

    static String canKnightReachInOneMove (int r1, int c1, int r2, int c2) {
        int xDiff = Math.abs(r1 - r2);
        int yDiff = Math.abs(c1 - c2);
        return xDiff == 2 && yDiff == 1 || xDiff == 1 && yDiff == 2 ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        for (int i = 1; i <= caseNo; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            sb.append("Case " + i + ": ").append(canKnightReachInOneMove(r1, c1, r2, c2)).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
