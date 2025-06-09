package test10698;

import java.io.*;
import java.util.StringTokenizer;

public class AhmedAly {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= caseNo; i++) {
            boolean flag = true;
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            char op = st.nextToken().charAt(0);
            int b = Integer.parseInt(st.nextToken());
            st.nextToken();
            int c = Integer.parseInt(st.nextToken());

            if (op == '+') {
                flag = a + b == c;
            } else {
                flag = a - b == c;
            }

            sb.append("Case " + i + ": ").append(flag ? "YES" : "NO").append('\n');
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
