package test28014;

import java.io.*;
import java.util.StringTokenizer;

public class TowerPushBreaker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int pre = 0, cnt = 0;
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int h = Integer.parseInt(st.nextToken());

            if (pre <= h) cnt++;

            pre = h;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
