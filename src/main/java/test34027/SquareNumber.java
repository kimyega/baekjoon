package test34027;

import java.io.*;

public class SquareNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int sqrt = (int) Math.sqrt(n);
            sb.append(sqrt * sqrt == n ? 1 : 0).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
