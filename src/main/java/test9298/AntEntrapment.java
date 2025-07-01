package test9298;

import java.io.*;
import java.util.StringTokenizer;

public class AntEntrapment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        for (int i = 1; i <= caseNo; i++) {
            double maxX = Double.NEGATIVE_INFINITY, minX = Double.POSITIVE_INFINITY, maxY = Double.NEGATIVE_INFINITY, minY = Double.POSITIVE_INFINITY;
            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                double x = Double.parseDouble(st.nextToken());
                double y = Double.parseDouble(st.nextToken());

                minX = Math.min(minX, x);
                minY = Math.min(minY, y);
                maxX = Math.max(maxX, x);
                maxY = Math.max(maxY, y);
            }

            double diffX = maxX - minX;
            double diffY = maxY - minY;

            double area = diffX * diffY;
            double perimeter = (diffX + diffY) * 2;

            sb.append(String.format("Case %d: Area %.9f, Perimeter %.9f\n", i, area, perimeter));
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
