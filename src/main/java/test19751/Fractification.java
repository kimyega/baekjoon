package test19751;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Fractification {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] frac = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            frac[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(frac);

        int a = frac[0];
        int b = frac[2];
        int c = frac[1];
        int d = frac[3];

        bw.write(a + " " + b + " " + c + " " + d);

        bw.flush();
        bw.close();
        br.close();
    }
}
