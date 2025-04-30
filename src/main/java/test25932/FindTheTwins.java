package test25932;

import java.io.*;
import java.util.StringTokenizer;

public class FindTheTwins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            boolean isZack = false, isMack = false;
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            sb.append(s + "\n");

            while (st.hasMoreTokens()) {
                int n = Integer.parseInt(st.nextToken());

                if (n == 18) {
                    isMack = true;
                } else if (n == 17) {
                    isZack = true;
                }
            }

            String res = isMack && isZack ? "both" : isMack ? "mack" : isZack ? "zack" : "none";
            sb.append(res + "\n\n");
        }

        sb.delete(sb.length() - 2, sb.length());
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
