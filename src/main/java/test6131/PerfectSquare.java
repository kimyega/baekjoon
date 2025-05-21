package test6131;

import java.io.*;

public class PerfectSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        double b = 0;

        for (int i = 1; i <= 500; i++) {
            b = Math.sqrt(i * i + n);

            if (b <= 500 && b == (int) b) {
                cnt++;
            }
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
