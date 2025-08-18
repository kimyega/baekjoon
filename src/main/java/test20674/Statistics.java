package test20674;

import java.io.*;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int pre = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(br.readLine());
            if (i == 0) pre = p;
            if (pre < p) sum += p - pre;
            pre = p - pre;
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
