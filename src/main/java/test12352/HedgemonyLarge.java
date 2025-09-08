package test12352;

import java.io.*;
import java.util.StringTokenizer;

public class HedgemonyLarge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= caseNo; i++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine().trim());

            double pre = Double.parseDouble(st.nextToken());
            double curr = Double.parseDouble(st.nextToken());
            double post = 0, avg = 0;

            while (st.hasMoreTokens()) {
                post = Double.parseDouble(st.nextToken());

                avg = (post + pre) / 2.0;
                if (curr > avg) curr = avg;

                pre = curr;
                curr = post;
            }


            sb.append(String.format("Case #%d: %.6f\n", i, pre));
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
