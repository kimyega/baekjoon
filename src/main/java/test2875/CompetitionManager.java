package test2875;

import java.io.*;
import java.util.StringTokenizer;

public class CompetitionManager {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int mk = 0, res = 0;

        for (int nk = 0; nk <= k; nk++) {
            mk = k - nk;
            res = Math.max(Math.min((n - nk) / 2, m - mk), res);
        }

        bw.write(res + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
