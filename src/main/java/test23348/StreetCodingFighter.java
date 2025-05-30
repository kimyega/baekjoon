package test23348;

import java.io.*;
import java.util.StringTokenizer;

public class StreetCodingFighter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            int total = 0;

            for (int i = 0; i < 3; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                int score = a * A + b * B + c * C;
                total += score;
            }

            max = Math.max(max, total);
        }

        bw.write(max + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
