package test33179;

import java.io.*;
import java.util.StringTokenizer;

public class AnnualReport {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int p = Integer.parseInt(st.nextToken());

            sum += p % 2 == 0 ? p : p + 1;
        }

        int res = sum / 2;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
