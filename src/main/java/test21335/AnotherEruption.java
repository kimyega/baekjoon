package test21335;

import java.io.*;

public class AnotherEruption {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long a = Long.parseLong(br.readLine());
        double pi = Math.PI;

        double res = Math.sqrt(a / pi) * 2 * pi;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
