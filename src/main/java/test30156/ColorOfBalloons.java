package test30156;

import java.io.*;

public class ColorOfBalloons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int aCount = 0, bCount = 0;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            String line = br.readLine();

            aCount = line.replaceAll("b", "").length();
            bCount = line.length() - aCount;

            sb.append(Math.min(aCount, bCount) + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
