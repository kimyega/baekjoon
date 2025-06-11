package test20410;

import java.io.*;
import java.util.StringTokenizer;

public class PrizeDrawMission {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int seed = Integer.parseInt(st.nextToken());
        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());

        int numerator = (x2 - x1 + m) % m;
        int denominator = (x1 - seed + m) % m;

        int inv = modInverse(denominator, m);

        int a = (numerator * inv) % m;
        int c = (x1 - a * seed) % m;
        if (c < 0) c += m;

        bw.write(a + " " + c + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    static int modInverse(int a, int m) {
        int m0 = m, t, q;
        int x0 = 0, x1 = 1;

        if (m == 1) return -1;

        while (a > 1) {
            q = a / m;
            t = m;

            m = a % m;
            a = t;

            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }

        if (x1 < 0) x1 += m0;

        return x1;
    }
}
