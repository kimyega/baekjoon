package test13484;

import java.io.*;

public class Tarifa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int left = 0;

        while (n-- > 0) {
            int monthlyLimit = x + left;
            int p = Integer.parseInt(br.readLine());

            left = monthlyLimit - p;
        }

        bw.write(x + left + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
