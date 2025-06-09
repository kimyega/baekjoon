package test14682;

import java.io.*;

public class ShiftySum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i <= k; i++) {
            sum += n * (int) Math.pow(10, i);
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
