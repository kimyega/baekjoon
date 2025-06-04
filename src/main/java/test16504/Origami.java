package test16504;

import java.io.*;
import java.util.StringTokenizer;

public class Origami {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        long n = Long.parseLong(br.readLine());
        long sum = 0;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                sum += Long.parseLong(st.nextToken());
            }
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
