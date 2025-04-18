package test30979;

import java.io.*;
import java.util.StringTokenizer;

public class PuppyCare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int times = Integer.parseInt(br.readLine());
        int candyNo = Integer.parseInt(br.readLine());

        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }

        if (times <= sum) {
            bw.write("Padaeng_i Happy");
        } else {
            bw.write("Padaeng_i Cry");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
