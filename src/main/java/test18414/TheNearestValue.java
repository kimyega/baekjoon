package test18414;

import java.io.*;
import java.util.StringTokenizer;

public class TheNearestValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int min = 0, minNo = 0;

        for (int i = l; i <= r; i++) {
            int abs = Math.abs(n - i);

            if (i == l) {
                min = abs;
                minNo = i;
                continue;
            }

            if (min > abs) {
                min = abs;
                minNo = i;
            }
        }

        bw.write(minNo + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
