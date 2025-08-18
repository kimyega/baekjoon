package test7366;

import java.io.*;
import java.util.StringTokenizer;

public class CountingSheep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        for (int i = 1; i <= caseNo; i++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int cnt = 0;

            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                if (s.equals("sheep")) cnt++;
            }

            sb.append("Case " + i + ": This list contains " + cnt + " sheep.\n\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
