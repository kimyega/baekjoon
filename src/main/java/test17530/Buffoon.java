package test17530;

import java.io.*;

public class Buffoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0, no = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int v = Integer.parseInt(br.readLine());

            if (v > max) {
                max = v;
                no = i;
            }
        }

        bw.write(no == 1 ? "S" : "N");

        bw.flush();
        bw.close();
        br.close();
    }
}
