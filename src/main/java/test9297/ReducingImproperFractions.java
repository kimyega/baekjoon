package test9297;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ReducingImproperFractions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringJoiner sjLine = new StringJoiner("\n");

        for (int i = 1; i <= caseNo; i++) {
            StringJoiner sj = new StringJoiner(" ");

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int div = a / b;
            int rmd = a % b;
            sj.add("Case").add(i + ":");

            if (rmd == 0 && div == 0) sj.add("0");
            if (div != 0) sj.add(div + "");
            if (rmd != 0) sj.add(rmd + "/" + b);

            sjLine.add(sj.toString());
        }

        bw.write(sjLine.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
