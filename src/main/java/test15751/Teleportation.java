package test15751;

import java.io.*;
import java.util.StringTokenizer;

public class Teleportation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());


        int telXY = Math.abs(a - x) + Math.abs(b - y);
        int telYX = Math.abs(a - y) + Math.abs(b - x);
        int len = Math.max(a, b) - Math.min(a, b);

        int min = Math.min(len, Math.min(telXY, telYX));

        bw.write(min + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
