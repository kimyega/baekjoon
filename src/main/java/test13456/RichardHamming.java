package test13456;

import java.io.*;
import java.util.StringTokenizer;

public class RichardHamming {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1;
        StringTokenizer st2;

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            st1 = new StringTokenizer(br.readLine());
            st2 = new StringTokenizer(br.readLine());

            int hamming = 0;

            while (st1.hasMoreTokens()) {
                int x1 = Integer.parseInt(st1.nextToken());
                int x2 = Integer.parseInt(st2.nextToken());
                if (x1 != x2) hamming++;
            }

            sb.append(hamming).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
