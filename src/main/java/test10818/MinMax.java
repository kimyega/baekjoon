package test10818;

import java.io.*;
import java.util.StringTokenizer;

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        bw.write(min + " " + max);

        bw.flush();
        bw.close();
        br.close();
    }
}
