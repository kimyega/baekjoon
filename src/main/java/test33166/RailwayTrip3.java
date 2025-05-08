package test33166;

import java.io.*;
import java.util.StringTokenizer;

public class RailwayTrip3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int res = q <= p ? q * a : p * a + (q - p) * b;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
