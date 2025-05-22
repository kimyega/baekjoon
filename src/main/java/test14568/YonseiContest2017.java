package test14568;

import java.io.*;

public class YonseiContest2017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int C = Integer.parseInt(br.readLine());

        for (int N = 1; N <= C; N++) {
            for (int Y = 1; Y <= C - N; Y++) {
                int T = C - N - Y;

                if (T < 1) continue;

                if (N >= Y + 2 && T % 2 == 0) {
                    count++;
                }
            }
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
