package test9501;

import java.io.*;
import java.util.StringTokenizer;

public class KkoongSpaceAdventure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int cnt = 0;

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            double d = Double.parseDouble(st.nextToken());

            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                int v = Integer.parseInt(st.nextToken());
                double s = Double.parseDouble(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                double sd = v * s / c;
                if (sd >= d) cnt++;
            }

            sb.append(cnt).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
