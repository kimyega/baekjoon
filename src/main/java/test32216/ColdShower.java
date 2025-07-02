package test32216;

import java.io.*;
import java.util.StringTokenizer;

public class ColdShower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int t0 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int ti = t0, res = 0;

        while (st.hasMoreTokens()) {
            int d = Integer.parseInt(st.nextToken());

            if (ti > k) ti = ti + d - Math.abs(ti - k);
            else if (ti < k) ti = ti + d + Math.abs(ti - k);
            else ti = ti + d;

            res += Math.abs(ti - k);
        }

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
