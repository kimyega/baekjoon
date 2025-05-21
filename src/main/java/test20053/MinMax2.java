package test20053;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MinMax2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringJoiner sj = new StringJoiner("\n");

        while (caseNo-- > 0) {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            sj.add(min + " " + max);
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
