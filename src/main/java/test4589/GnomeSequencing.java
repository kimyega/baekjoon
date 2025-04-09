package test4589;

import java.io.*;
import java.util.StringTokenizer;

public class GnomeSequencing {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append("Gnomes:\n");
        for (int i = 0; i < caseNo; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = 0, max = 0;
            int[] num = new int[3];

            for (int j = 0; j < 3; j++) {
                int n = Integer.parseInt(st.nextToken());
                num[j] = n;

                if (j == 0) {
                    min = n;
                    max = n;
                } else {
                    min = Math.min(min, n);
                    max = Math.max(max, n);
                }
            }

            if (num[0] == max && num[2] == min || num[0] == min && num[2] == max) {
                sb.append("Ordered\n");
            } else {
                sb.append("Unordered\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
