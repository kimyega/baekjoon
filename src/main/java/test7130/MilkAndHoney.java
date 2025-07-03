package test7130;

import java.io.*;
import java.util.StringTokenizer;

public class MilkAndHoney {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        int happiness = 0;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            happiness += Math.max(c * m, b * h);
        }

        bw.write(happiness + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
