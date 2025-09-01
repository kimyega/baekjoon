package test25869;

import java.io.*;
import java.util.StringTokenizer;

public class WindowOnTheWall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());


        int ww = w - 2 * d;
        int wh = h - 2 * d;
        int wr = ww < 0 || wh < 0 ? 0 : ww * wh;

        bw.write(wr + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
