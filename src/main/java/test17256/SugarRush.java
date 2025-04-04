package test17256;

import java.io.*;
import java.util.StringTokenizer;

public class SugarRush {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int ax = Integer.parseInt(st1.nextToken());
        int ay = Integer.parseInt(st1.nextToken());
        int az = Integer.parseInt(st1.nextToken());
        int cx = Integer.parseInt(st2.nextToken());
        int cy = Integer.parseInt(st2.nextToken());
        int cz = Integer.parseInt(st2.nextToken());

        int bx = cx - az;
        int by = cy / ay;
        int bz = cz - ax;
        StringBuilder sb = new StringBuilder();
        sb.append(bx + " ").append(by + " ").append(bz);
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
