package test14683;

import java.io.*;
import java.util.StringTokenizer;

public class ExactlyElectrical {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int sx = Integer.parseInt(st.nextToken());
        int sy = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int ex = Integer.parseInt(st.nextToken());
        int ey = Integer.parseInt(st.nextToken());

        int b = Integer.parseInt(br.readLine());

        int d = Math.abs(sx - ex) + Math.abs(sy - ey);

        bw.write(b < d ? "N" : (b - d) % 2 == 0 ? "Y" : "N");

        bw.flush();
        bw.close();
        br.close();
    }
}
