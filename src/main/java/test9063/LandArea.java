package test9063;

import java.io.*;
import java.util.StringTokenizer;

public class LandArea {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        int square = (maxX - minX) * (maxY - minY);
        bw.write(square + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
