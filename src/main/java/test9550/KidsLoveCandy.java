package test9550;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class KidsLoveCandy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringJoiner sj = new StringJoiner("\n");

        while (caseNo-- > 0) {
            int kids = 0;

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int candy = Integer.parseInt(st.nextToken());
                kids += candy / k;
            }

            sj.add(kids + "");
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
