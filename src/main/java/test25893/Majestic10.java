package test25893;

import java.io.*;
import java.util.StringTokenizer;

public class Majestic10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] majestic = {"zilch", "double", "double-double", "triple-double"};

        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());
        while (caseNo-- > 0) {
            int idx = 0;
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            while (st.hasMoreTokens()) {
                int score = Integer.parseInt(st.nextToken());

                if (score >= 10) {
                    idx++;
                }
            }

            sb.append(s + "\n");
            sb.append(majestic[idx] + "\n\n");
        }

        sb.delete(sb.length() - 2, sb.length());
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
