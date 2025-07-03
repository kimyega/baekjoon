package test4850;

import java.io.*;
import java.util.StringTokenizer;

public class BasketsOfGoldCoins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        String line = "";

        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int total_weight = Integer.parseInt(st.nextToken());

            int expected_weight = w * n * (n - 1) / 2;
            int diff = expected_weight - total_weight;

            int res;

            if (diff == 0) {
                res = n;
            } else {
                res = diff / d;
            }

            sb.append(res + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
