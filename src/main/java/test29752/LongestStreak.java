package test29752;

import java.io.*;
import java.util.StringTokenizer;

public class LongestStreak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0, max = 0;

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            String s = st.nextToken();

            if (!s.equals("0")) {
                cnt++;
            } else {
                cnt = 0;
            }

            max = Math.max(max, cnt);
        }

        bw.write(max + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
