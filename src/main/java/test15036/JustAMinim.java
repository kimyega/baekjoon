package test15036;

import java.io.*;
import java.util.StringTokenizer;

public class JustAMinim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double tune = 0;

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());

            if (n == 0) tune += 2;
            else if (n == 1) tune += 1;
            else if (n == 2) tune += 1 / 2.0;
            else if (n == 4) tune += 1 / 4.0;
            else if (n == 8) tune += 1 / 8.0;
            else if (n == 16) tune += 1 / 16.0;
        }

        bw.write(tune + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
