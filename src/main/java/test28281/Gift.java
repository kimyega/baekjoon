package test28281;

import java.io.*;
import java.util.StringTokenizer;

public class Gift {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int pre = 0, sum = 0, minSum = 0;

        while (st2.hasMoreTokens()) {
            int number = Integer.parseInt(st2.nextToken());

            if (pre != 0) {
                sum = pre + number;
            }

            if (minSum == 0) {
                minSum = sum;
            } else {
                minSum = Math.min(sum, minSum);
            }

            pre = number;
        }

        bw.write(minSum * x + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
