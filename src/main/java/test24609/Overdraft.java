package test24609;

import java.io.*;

public class Overdraft {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int charge = 0, minCharge = 0;

        while (n-- > 0) {
            int t = Integer.parseInt(br.readLine());
            charge += t;
            minCharge = Math.min(minCharge, charge);
        }

        int res = minCharge < 0 ? -minCharge : 0;
        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
