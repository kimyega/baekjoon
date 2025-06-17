package test17944;

import java.io.*;
import java.util.StringTokenizer;

public class PongDang1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int pal = 1, dir = 0;

        for (int i = 1; ; i++) {
            if (i == t) break;

            if (pal == 1) dir = 1;
            else if (pal == 2 * n) dir = -1;

            pal += dir;
        }

        bw.write(pal + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
