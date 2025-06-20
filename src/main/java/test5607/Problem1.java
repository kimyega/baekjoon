package test5607;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int aScore = 0, bScore = 0;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a > b) {
                a += b;
                b = 0;
            } else if (a < b) {
                b += a;
                a = 0;
            }

            aScore += a;
            bScore += b;
        }

        bw.write(aScore + " " + bScore);

        bw.flush();
        bw.close();
        br.close();
    }
}
