package test11312;

import java.io.*;
import java.util.StringTokenizer;

public class TrianglePattern2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long res = (a / b) * (a / b);

            sb.append(res).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
