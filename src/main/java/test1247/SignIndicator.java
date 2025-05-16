package test1247;

import java.io.*;
import java.math.BigInteger;
import java.util.StringJoiner;

public class SignIndicator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = 3;
        StringJoiner sj = new StringJoiner("\n");

        while (caseNo-- > 0) {
            BigInteger sum  = new BigInteger("0");
            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                long num = Long.parseLong(br.readLine());
                sum = sum.add(BigInteger.valueOf(num));
            }

            int sign = sum.compareTo(BigInteger.ZERO);
            sj.add(sign == 0 ? "0" : sign > 0 ? "+" : "-");
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
