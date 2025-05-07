package test30143;

import java.io.*;
import java.util.StringTokenizer;

public class CookiePiles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            int diff = Integer.parseInt(st.nextToken());

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += start + diff * i;
            }

            sb.append(sum + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
