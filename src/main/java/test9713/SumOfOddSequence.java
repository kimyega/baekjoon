package test9713;

import java.io.*;

public class SumOfOddSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int odd = n % 2 == 0 ? n / 2 : (n + 1) / 2;
            sb.append(odd * odd).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
