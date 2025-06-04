package test15784;

import java.io.*;
import java.util.StringTokenizer;

public class JealousJinSeo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        int jap = 0, maxAp = 0;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                int ap = Integer.parseInt(st.nextToken());

                if (i == a && j == b) jap = ap;
                else if (i == a || j == b) maxAp = Math.max(maxAp, ap);
            }
        }

        bw.write(jap < maxAp ? "ANGRY" : "HAPPY");

        bw.flush();
        bw.close();
        br.close();
    }
}
