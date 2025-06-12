package test25756;

import java.io.*;
import java.util.StringTokenizer;

public class DefenseIgnore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        double v = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());

            v = 1 - (1 - v) * (1 - a / 100.0);
            sb.append(v * 100).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
