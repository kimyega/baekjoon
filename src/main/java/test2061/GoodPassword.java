package test2061;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class GoodPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger k = new BigInteger(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int min = 0;

        for (int i = 2; i < l; i++) {
            if (k.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                min = i;
                break;
            }
        }

        String res = (min == 0) ? "GOOD" : "BAD " + min;
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
