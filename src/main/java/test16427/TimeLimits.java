package test16427;

import java.io.*;
import java.util.StringTokenizer;

public class TimeLimits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int max = 0;

        while (st.hasMoreTokens()) {
            int m = Integer.parseInt(st.nextToken());
            max = Math.max(max, m);
        }

        int res = (int) Math.ceil(max * s / 1000.0);

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
