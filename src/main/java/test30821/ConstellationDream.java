package test30821;

import java.io.*;

public class ConstellationDream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long numerator = 1;
        for (int i = 0; i < 5; i++) {
            numerator *= (n - i);
        }

        long denominator = 120;
        long res = numerator / denominator;

        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
