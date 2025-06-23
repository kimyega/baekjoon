package test9286;

import java.io.*;
import java.util.StringJoiner;

public class Gradabase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringJoiner sj = new StringJoiner("\n");

        for (int i = 1; i <= caseNo; i++) {
            int n = Integer.parseInt(br.readLine());

            sj.add("Case " + i + ":");

            while (n-- > 0) {
                int grade = Integer.parseInt(br.readLine());
                grade++;
                if (grade < 7) sj.add(grade + "");
            }
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
