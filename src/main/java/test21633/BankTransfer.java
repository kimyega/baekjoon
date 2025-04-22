package test21633;

import java.io.*;

public class BankTransfer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());

        double res = 25 + k * 0.01;

        if (res < 100) {
            res = 100;
        } else if (res > 2000) {
            res = 2000;
        }

        bw.write(String.format("%.2f", res));

        bw.flush();
        bw.close();
        br.close();
    }
}
