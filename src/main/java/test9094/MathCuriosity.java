package test9094;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MathCuriosity {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringJoiner sj = new StringJoiner("\n");

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int count = 0;

            for (int b = 1; b < n; b++) {
                for (int a = 1; a < b; a++) {
                    if ((a * a + b * b + m) % (a * b) == 0) count++;
                }
            }

            sj.add(String.valueOf(count));
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
