package test26560;

import java.io.*;

public class Periods {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String line = "";

        while (caseNo-- > 0) {
            line = br.readLine();

            if (line.charAt(line.length() - 1) != '.') {
                sb.append(line + ".\n");
            } else {
                sb.append(line + "\n");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
