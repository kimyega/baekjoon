package test1547;

import java.io.*;
import java.util.StringTokenizer;

public class Ball {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        boolean[] isBall = new boolean[3];
        isBall[0] = true;

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            boolean temp;

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            temp = isBall[a - 1];
            isBall[a - 1] = isBall[b - 1];
            isBall[b - 1] = temp;
        }

        for (int i = 0; i < isBall.length; i++) {
            if (isBall[i]) {
                bw.write((i + 1) + "");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
