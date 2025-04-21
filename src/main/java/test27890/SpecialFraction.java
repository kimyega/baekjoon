package test27890;

import java.io.*;
import java.util.StringTokenizer;

public class SpecialFraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = x * 2;
            }
            x = x ^ 6;
        }

        bw.write(x + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
