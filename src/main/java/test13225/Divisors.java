package test13225;

import java.io.*;

public class Divisors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int cnt = 0;
            int n = Integer.parseInt(br.readLine());

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) cnt++;
            }

            sb.append(n + " " + cnt + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
