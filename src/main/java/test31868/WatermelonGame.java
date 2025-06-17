package test31868;

import java.io.*;
import java.util.StringTokenizer;

public class WatermelonGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bw.write(makeWatermelon(n, k) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    static int level;
    static int makeWatermelon(int n, int k) {
        level++;
        if (level == n) return k;
        k /= 2;
        return makeWatermelon(n, k);
    }
}
