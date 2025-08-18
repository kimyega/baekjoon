package test33868;

import java.io.*;
import java.util.StringTokenizer;

public class StickerGiver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int tMax = Integer.MIN_VALUE, bMin = Integer.MAX_VALUE;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tMax = Math.max(tMax, t);
            bMin = Math.min(bMin, b);
        }

        int res = (tMax * bMin) % 7 + 1;

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
