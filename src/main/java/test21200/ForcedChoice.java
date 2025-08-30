package test21200;

import java.io.*;
import java.util.StringTokenizer;

public class ForcedChoice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (s-- > 0) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());

            boolean shouldKeep = false;

            while (st.hasMoreTokens()) {
                int c = Integer.parseInt(st.nextToken());
                if (c == p) shouldKeep = true;
            }

            sb.append(shouldKeep ? "KEEP" : "REMOVE").append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
