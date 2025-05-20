package test16673;

import java.io.*;
import java.util.StringTokenizer;

public class KoreaUniWine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int wines = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= c; i++) {
            wines += k * i + p * i * i;
        }

        bw.write(wines + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
