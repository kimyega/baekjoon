package test29738;

import java.io.*;

public class GoodbyeCodeJam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseNo; i++) {
            int n = Integer.parseInt(br.readLine());
            String nextRound = n <= 25 ? "World Finals" : n <= 1000 ? "Round 3" : n <= 4500 ? "Round 2" : "Round 1";

            sb.append("Case #" + (i + 1) + ": " + nextRound + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
