package test12351;

import java.io.*;
import java.util.StringTokenizer;

public class HedgemonySmall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            double[] bush = new double[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                bush[i] = Double.parseDouble(st.nextToken());
            }

            for (int i = 1; i < n - 1; i++) {
                double avg = (bush[i - 1] + bush[i + 1]) / 2.0;
                if (bush[i] > avg)bush[i] = avg;
            }

            sb.append("Case #").append(tc).append(": ").append(bush[n - 2]).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
