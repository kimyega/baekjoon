package test16428;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class AModB3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        BigInteger q = a.divide(b);
        BigInteger r = a.remainder(b);

        if (r.signum() < 0) {
            r = r.add(b.abs());
            q = q.subtract(b.signum() > 0 ? BigInteger.ONE : BigInteger.valueOf(-1));
        }

        bw.write(q + "\n" + r);

        bw.flush();
        bw.close();
        br.close();
    }
}
