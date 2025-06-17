package test13073;

import java.io.*;

public class Sums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int sum1 = n * (n + 1) / 2;
            int sum2 = n * n;
            int sum3 = n * (n + 1);

            sb.append(sum1 + " " + sum2 + " " + sum3).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
