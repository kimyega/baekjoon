package test8718;

import java.io.*;
import java.util.StringTokenizer;

public class Bałwanek {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        double[] snowmans = {
                k + 2.0 * k + 4.0 * k,
                k / 2.0 + k + 2.0 * k,
                k / 4.0 + k / 2.0 + k
        };

        double max = 0;

        for (double snowman : snowmans) {
            if (snowman <= x) max = Math.max(snowman, max);
        }

        int res = (int) (max * 1000);
        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
