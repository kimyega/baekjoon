package test20833;

import java.io.*;

public class Kuber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int res = (int) Math.pow((double) (n * (n + 1)) / 2, 2);

        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
