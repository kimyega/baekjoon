package test14215;

import java.io.*;
import java.util.StringTokenizer;

public class ThreeBars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0, max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            sum += n;
            max = Math.max(max, n);
        }

        int diff = sum - max;
        int res = diff > max ? sum : diff * 2 - 1;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
