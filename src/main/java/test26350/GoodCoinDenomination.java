package test26350;

import java.io.*;
import java.util.StringTokenizer;

public class GoodCoinDenomination {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int pre = 0;
            boolean isGood = true;
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int count = Integer.parseInt(st.nextToken());

            while (st.hasMoreTokens()) {
                int n = Integer.parseInt(st.nextToken());

                if (pre * 2 > n) {
                    isGood = false;
                    break;
                }

                pre = n;
            }

            int idx = line.indexOf(" ");
            sb.append("Denominations:").append(line.substring(idx)).append("\n");
            sb.append(isGood ? "Good" : "Bad").append(" coin denominations!\n\n");
        }

        sb.delete(sb.length() - 2, sb.length());
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
