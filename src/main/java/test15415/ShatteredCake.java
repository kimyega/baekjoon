package test15415;

import java.io.*;
import java.util.StringTokenizer;

public class ShatteredCake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int W = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int cake = 0;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            cake += w * l;
        }

        int L = cake / W;

        bw.write(L + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
