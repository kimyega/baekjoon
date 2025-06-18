package test9723;

import java.io.*;
import java.util.StringTokenizer;

public class RightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        for (int i = 1; i <= caseNo; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int max = Math.max(a, Math.max(b, c));
            int sum = a * a + b * b + c * c;
            sb.append("Case #" + i + ": ").append(max * max * 2 == sum ? "YES" : "NO").append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
