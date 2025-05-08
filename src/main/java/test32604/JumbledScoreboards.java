package test32604;

import java.io.*;
import java.util.StringTokenizer;

public class JumbledScoreboards {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int preA = 0, preB = 0;
        boolean isOrder = true;

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a < preA || b < preB) {
                isOrder = false;
            }

            preA = a;
            preB = b;
        }

        bw.write(isOrder ? "yes" : "no");

        bw.flush();
        bw.close();
        br.close();
    }
}
