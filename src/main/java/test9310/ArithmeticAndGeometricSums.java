package test9310;

import java.io.*;
import java.util.StringTokenizer;

public class ArithmeticAndGeometricSums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int d = 0, r = 0, sum = 0;

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());

            int d1 = a2 - a1;
            int d2 = a3 - a2;

            if (d1 == d2) {
                d = d1;
                sum = n * (2 * a1 + (n - 1) * d) / 2;
            } else {
                r = a2 / a1;
                sum = a1 * (int) (Math.pow(r, n) - 1) / (r - 1);
            }

            sb.append(sum + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
