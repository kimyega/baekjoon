package test8725;

import java.io.*;
import java.util.StringTokenizer;

public class Szachy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        long sum = 0;

        while (n-- > 0) {
            int max = Integer.MIN_VALUE;
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int score = Integer.parseInt(st.nextToken());
                max = Math.max(max, score);
            }
            sum += max;
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
