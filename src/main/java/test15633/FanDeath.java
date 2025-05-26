package test15633;

import java.io.*;

public class FanDeath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        int res = sum * 5 - 24;
        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
