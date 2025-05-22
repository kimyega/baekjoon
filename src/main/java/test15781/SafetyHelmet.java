package test15781;

import java.io.*;
import java.util.StringTokenizer;

public class SafetyHelmet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int maxSum = 0;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 2; i++) {
            int max = 0;
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                max = Math.max(max, a);
            }

            maxSum += max;
        }

        bw.write(maxSum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
