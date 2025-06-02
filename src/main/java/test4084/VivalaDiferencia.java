package test4084;

import java.io.*;
import java.util.StringTokenizer;

public class VivalaDiferencia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0 && d == 0) break;

            sb.append(countConvergence(a, b, c, d)).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
    static int abs (int a, int b) {
        return Math.abs(a - b);
    }

    static int countConvergence(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) return 0;
        return 1 + countConvergence(abs(a, b), abs(b, c), abs(c, d), abs(d, a));
    }
}
