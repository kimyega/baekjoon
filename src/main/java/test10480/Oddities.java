package test10480;

import java.io.*;

public class Oddities {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseNo; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(n + " is ");

            if (n % 2 == 0) {
                sb.append("even");
            } else {
                sb.append("odd");
            }
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
