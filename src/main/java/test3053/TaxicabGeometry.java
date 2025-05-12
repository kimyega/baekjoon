package test3053;

import java.io.*;

public class TaxicabGeometry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double pi = Math.PI;

        int r = Integer.parseInt(br.readLine());

        double uclid = pi * r * r;
        double taxicab = 2 * r * r;

        bw.write(String.format("%.6f\n%.6f", uclid, taxicab));

        bw.flush();
        bw.close();
        br.close();
    }
}
