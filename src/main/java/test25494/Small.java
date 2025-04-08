package test25494;

import java.io.*;
import java.util.StringTokenizer;

public class Small {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        int[] res = new int[caseNo];

        for (int i = 0; i < caseNo; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int min = Math.min(a, Math.min(b, c));
            res[i] = min;
        }

        for (int n : res) {
            bw.write(n + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
