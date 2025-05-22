package test2547;

import java.io.*;
import java.math.BigInteger;

public class CandyTeacher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            br.readLine();
            BigInteger sum = BigInteger.ZERO;
            int n = Integer.parseInt(br.readLine());
            int st = n;

            while (st-- > 0) {
                BigInteger candy = new BigInteger(br.readLine());
                sum = sum.add(candy);
            }

            sb.append(sum.mod(BigInteger.valueOf(n)).toString().equals("0") ? "YES" : "NO").append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
