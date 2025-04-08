package test5523;

import java.io.*;
import java.util.StringTokenizer;

public class MatchResult {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        int countA = 0, countB = 0;

        for (int i = 0; i < caseNo; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a > b) countA++;
            else if (b > a) countB++;
        }

        bw.write(countA + " " + countB);

        bw.flush();
        bw.close();
        br.close();
    }
}
