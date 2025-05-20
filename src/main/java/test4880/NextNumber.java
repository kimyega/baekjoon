package test4880;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class NextNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        StringJoiner sj = new StringJoiner("\n");

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());

            if (a1 == 0 && a2 == 0 && a3 ==0) break;

            boolean isAp = a2 - a1 != 0 && a2 - a1 == a3 - a2;
            boolean isGp = a1 != 0 && a2 / a1 != 0 && a2 / a1 == a3 / a2;

            int nextN  = 0;
            String res = "";

            if (isAp) {
                nextN = a2 - a1 + a3;
                res = "AP";
            } else if (isGp) {
                nextN = a2 / a1 * a3;
                res = "GP";
            }

            sj.add(res + " " + nextN);
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
