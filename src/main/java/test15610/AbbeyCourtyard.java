package test15610;

import java.io.*;

public class AbbeyCourtyard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        double line = Math.sqrt(n) * 4;

        bw.write("" + line);
        bw.flush();
        bw.close();
        br.close();
    }
}
