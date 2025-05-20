package test5354;

import java.io.*;

public class JBox {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String sp = "#";
        String j = "J";
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int n = Integer.parseInt(br.readLine());

            String edge = sp.repeat(n);
            String mid = n <= 2 ? edge : sp + j.repeat(n - 2) + sp;

            for (int i = 1; i <= n; i++) {
                if (i == 1 || i == n) {
                    sb.append(edge);
                } else {
                    sb.append(mid);
                }

                sb.append("\n");
            }

            sb.append("\n");
        }

        sb.delete(sb.length() - 2, sb.length());
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
