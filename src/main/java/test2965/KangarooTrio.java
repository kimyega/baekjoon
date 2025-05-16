package test2965;

import java.io.*;
import java.util.StringTokenizer;

public class KangarooTrio {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int res = Math.max(b - a, c - b) - 1;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
