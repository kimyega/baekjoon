package test15858;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class SimpleArithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigDecimal A = new BigDecimal(st.nextToken());
        BigDecimal B = new BigDecimal(st.nextToken());
        BigDecimal C = new BigDecimal(st.nextToken());

        BigDecimal res = A.multiply(B).divide(C, 10, RoundingMode.HALF_UP);
        bw.write(res.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
