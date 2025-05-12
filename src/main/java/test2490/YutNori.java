package test2490;

import java.io.*;
import java.util.StringTokenizer;

public class YutNori {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int score = 0, cnt = 3;

        StringBuilder sb = new StringBuilder();

        while (cnt-- > 0) {
            int bae = 0;
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String nStr = st.nextToken();
                if (nStr.equals("0")) {
                    bae++;
                }
            }

            score = bae != 0 ? bae : 5;
            char c = (char)('A' +  score - 1);
            sb.append(c).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
