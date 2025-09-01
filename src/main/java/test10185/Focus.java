package test10185;

import java.io.*;
import java.util.StringTokenizer;

public class Focus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            double f = p * q / (double) (p + q);
            sb.append(String.format("f = %.1f\n", f));
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
