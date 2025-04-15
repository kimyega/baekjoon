package test5357;

import java.io.*;

public class Dedupe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseNo; i++) {
            char pre = 0;
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char now = str.charAt(j);
                if (j == 0) {
                    pre = now;
                    sb.append(pre + "");
                    continue;
                }

                if (pre != now) {
                    sb.append(now + "");
                }

                pre = now;
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
