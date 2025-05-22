package test10419;

import java.io.*;

public class LateRecord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int d = Integer.parseInt(br.readLine());
            int count = 0, n = 0;

            while (true) {
                n++;
                int ft = n * (n + 1);
                if (ft > d) break;
                count++;
            }

            sb.append(count).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
