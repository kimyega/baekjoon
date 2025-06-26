package test6974;

import java.io.*;
import java.math.BigInteger;

public class LongDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            BigInteger a = new BigInteger(br.readLine().trim());
            BigInteger b = new BigInteger(br.readLine().trim());

            BigInteger div = a.divide(b);
            BigInteger rem = a.remainder(b);

            bw.write(div.toString());
            bw.newLine();
            bw.write(rem.toString());
            bw.newLine();
            if (i != n - 1) bw.newLine();
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
