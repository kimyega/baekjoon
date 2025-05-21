package test11024;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Plus4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringJoiner sj = new StringJoiner("\n");

        while (caseNo-- > 0) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            sj.add(sum + "");
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
