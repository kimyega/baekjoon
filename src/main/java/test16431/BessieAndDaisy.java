package test16431;

import java.io.*;
import java.util.StringTokenizer;

public class BessieAndDaisy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int dx = Integer.parseInt(st.nextToken());
        int dy = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int jx = Integer.parseInt(st.nextToken());
        int jy = Integer.parseInt(st.nextToken());

        int bdt = Math.max(Math.abs(bx - jx), Math.abs(by - jy));
        int ddt = Math.abs(dx - jx) + Math.abs(dy - jy);

        String res = bdt == ddt ? "tie" : bdt < ddt ? "bessie" : "daisy";

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
