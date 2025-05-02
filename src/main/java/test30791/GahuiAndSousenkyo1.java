package test30791;

import java.io.*;
import java.util.StringTokenizer;

public class GahuiAndSousenkyo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int stth = Integer.parseInt(st.nextToken());

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());

            if (stth - n <= 1000) {
                count++;
            }
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
