package test3058;

import java.io.*;
import java.util.StringTokenizer;

public class EvenNumberFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            int sum = 0, min = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());

                if (num % 2 == 0) {
                    sum += num;
                    min = Math.min(min, num);
                }
            }

            sb.append(sum + " " + min + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
