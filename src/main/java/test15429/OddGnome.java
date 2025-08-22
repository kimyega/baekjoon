package test15429;

import java.io.*;
import java.util.StringTokenizer;

public class OddGnome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int pre = Integer.parseInt(st.nextToken());
            int cnt = 1;

            while (st.hasMoreTokens()) {
                cnt++;
                pre++;
                int gome = Integer.parseInt(st.nextToken());
                if (gome != pre) break;
            }

            sb.append(cnt + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
