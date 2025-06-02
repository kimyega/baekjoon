package test14579;

import java.io.*;
import java.util.StringTokenizer;

public class AddMulCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int mod = 14579;
        int total = 1;

        for (int i = a; i <= b; i++) {
            int sum = i * (i + 1) / 2;
            total = (int)(((long) total * sum) % mod);
        }

        bw.write(total + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
