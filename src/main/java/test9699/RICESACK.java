package test9699;

import java.io.*;
import java.util.StringTokenizer;

public class RICESACK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < caseNo; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < 5; j++) {
                int n = Integer.parseInt(st.nextToken());
                max = Math.max(max, n);
            }

            sb.append("Case #" + (i + 1) + ": " + max + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
