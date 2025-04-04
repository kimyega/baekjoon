package test13752;

import java.io.*;

public class Histogram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (caseNo-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append("=".repeat(n) + "\n");
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
