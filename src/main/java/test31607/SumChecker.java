package test31607;

import java.io.*;

public class SumChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0, max = Integer.MIN_VALUE, count = 3;

        while (count-- > 0) {
            int n = Integer.parseInt(br.readLine());
            max = Math.max(max, n);
            sum += n;
        }

        bw.write(sum == 2 * max ? "1" : "0");

        bw.flush();
        bw.close();
        br.close();
    }
}
