package test4619;

import java.io.*;
import java.util.StringTokenizer;

public class Root {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if (b == 0 && n == 0) break;

            int closest = 0;
            int minDiff = Integer.MAX_VALUE;

            for (int a = 1; ; a++) {
                int pow = (int) Math.pow(a, n);
                int diff = Math.abs(pow - b);

                if (diff < minDiff) {
                    minDiff = diff;
                    closest = a;
                } else break;
            }

            sb.append(closest + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
