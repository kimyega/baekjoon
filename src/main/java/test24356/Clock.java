package test24356;

import java.io.*;
import java.util.StringTokenizer;

public class Clock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());

        int start = t1 * 60 + m1;
        int end = t2 * 60 + m2;

        int m = end - start;
        if (m < 0) {
            m += 24 * 60;
        }
        int n = m / 30;

        bw.write(m + " " + n);

        bw.flush();
        bw.close();
        br.close();
    }
}
