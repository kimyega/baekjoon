package test11970;

import java.io.*;
import java.util.StringTokenizer;

public class FencePainting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        int fenceLen = y1 - x1 + y2 - x2;
        int overlap = Math.min(y1, y2) - Math.max(x1, x2);

        if (overlap < 0) overlap = 0;

        int res = fenceLen - overlap;
        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
