package test9288;

import java.io.*;

public class MoreDice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= caseNo; i++) {
            sb.append("Case " + i + ":\n");

            int sum = Integer.parseInt(br.readLine());

            for (int j = 1; j <= sum / 2; j++) {
                if (sum - j <= 6) sb.append("(").append(j).append(",").append(sum - j).append(")\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
