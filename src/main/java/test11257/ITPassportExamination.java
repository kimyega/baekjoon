package test11257;

import java.io.*;
import java.util.StringTokenizer;

public class ITPassportExamination {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < caseNo; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String examNum = st.nextToken();

            int s = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int sum = s + m + t;

            boolean isMinSum = sum >= 55;
            boolean isMinScore = s >= 35 * 0.3 && m >= 25 * 0.3 && t >= 40 * 0.3;

            sb.append(examNum + " " + sum + " ");

            if (isMinSum && isMinScore) {
                sb.append("PASS\n");
            } else {
                sb.append("FAIL\n");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
