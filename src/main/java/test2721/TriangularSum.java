package test2721;

import java.io.*;

public class TriangularSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int sum = 0;
            int n = Integer.parseInt(br.readLine());

            for (int i = 1; i <= n; i++) {
                sum += i * (i + 1) * (i + 2) / 2;
            }

            sb.append(sum).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
