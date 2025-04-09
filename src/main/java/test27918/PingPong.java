package test27918;

import java.io.*;

public class PingPong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        int dCount = 0, pCount = 0;

        while (caseNo-- > 0) {
            String s = br.readLine();

            if (Math.abs(dCount - pCount) == 2) {
                continue;
            }

            if (s.equals("D")) {
                dCount++;
            } else {
                pCount++;
            }
        }

        bw.write(dCount + ":" + pCount);
        bw.flush();
        bw.close();
        br.close();
    }
}
