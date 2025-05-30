package test27960;

import java.io.*;
import java.util.StringTokenizer;

public class ShootingGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sa = Integer.parseInt(st.nextToken());
        int sb = Integer.parseInt(st.nextToken());

        int sc = sa ^ sb;

        bw.write(sc + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
