package test20352;

import java.io.*;

public class Circus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        double pi = Math.PI;
        double fence = Math.sqrt(n / pi) * pi * 2;

        bw.write(fence + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
