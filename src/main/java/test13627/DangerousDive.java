package test13627;

import java.io.*;
import java.util.StringTokenizer;

public class DangerousDive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        boolean[] hasReturned = new boolean[n];

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());
            hasReturned[x - 1] = true;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (!hasReturned[i]) sb.append(i + 1).append(" ");
        }

        bw.write(n == r ? "*" : sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}
