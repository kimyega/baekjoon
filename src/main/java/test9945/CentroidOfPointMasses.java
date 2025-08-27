package test9945;

import java.io.*;
import java.util.StringTokenizer;

public class CentroidOfPointMasses {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = 1;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n < 0) break;
            sb.append("Case " + caseNo + ": ");

            long xSum = 0, ySum = 0, massSum = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                xSum += (long) x * m;
                ySum += (long) y * m;
                massSum += m;
            }

            br.readLine();

            double a = xSum / (double) massSum;
            double b = ySum / (double) massSum;

            sb.append(String.format("%.2f %.2f\n", a, b));
            caseNo++;
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
