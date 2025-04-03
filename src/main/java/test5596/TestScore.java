package test5596;

import java.io.*;
import java.util.StringTokenizer;

public class TestScore {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int sum1 = 0, sum2 = 0;
        while (st1.hasMoreTokens()) {
            sum1 += Integer.parseInt(st1.nextToken());
        }
        while (st2.hasMoreTokens()) {
            sum2 += Integer.parseInt(st2.nextToken());
        }
        if (sum1 >= sum2) {
            bw.write(sum1 + "\n");
        } else {
            bw.write(sum2 + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
