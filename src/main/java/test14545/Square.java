package test14545;

import java.io.*;

public class Square {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            long n = Integer.parseInt(br.readLine());
            long res = n * (n + 1) *(2 * n + 1) / 6;
            sb.append(res).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
