package test7279;

import java.io.*;
import java.util.StringTokenizer;

public class Autobusas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int bus = 0, max = 0;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bus += a;
            bus -= b;

            int diff = bus > k ? bus - k : 0;
            max = Math.max(max, diff);
        }

        bw.write(max + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
