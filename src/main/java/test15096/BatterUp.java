package test15096;

import java.io.*;
import java.util.StringTokenizer;

public class BatterUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int bases = 0, bats = 0;

        while (st.hasMoreTokens()) {
            int base = Integer.parseInt(st.nextToken());
            if (base >= 0) {
                bases += base;
                bats++;
            }
        }

        double res = bases / (double) bats;
        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
