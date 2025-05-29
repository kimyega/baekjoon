package test13416;

import java.io.*;
import java.util.StringTokenizer;

public class StockInvestment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int sum = 0;
            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                int max = 0;
                st = new StringTokenizer(br.readLine());

                while (st.hasMoreTokens()) {
                    int stock = Integer.parseInt(st.nextToken());
                    max = Math.max(max, stock);
                }

                sum += max;
            }

            sb.append(sum).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
