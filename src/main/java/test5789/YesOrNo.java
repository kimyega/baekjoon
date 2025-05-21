package test5789;

import java.io.*;
import java.util.StringJoiner;

public class YesOrNo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringJoiner sj = new StringJoiner("\n");

        while (caseNo-- > 0) {
            String s = br.readLine();
            int len = s.length();

            char c1 = s.charAt(len / 2 - 1);
            char c2 = s.charAt(len / 2);

            String yon = c1 == c2 ? "Do-it" : "Do-it-Not";
            sj.add(yon);
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
