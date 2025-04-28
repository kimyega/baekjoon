package test24365;

import java.io.*;
import java.util.StringTokenizer;

public class BeeMaya {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int avg = (a + b + c) / 3;
        int dt = 0;

        dt += Math.abs(a - avg);
        dt += Math.abs(c - avg);

        bw.write(dt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
