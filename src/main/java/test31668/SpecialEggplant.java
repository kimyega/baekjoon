package test31668;

import java.io.*;

public class SpecialEggplant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int res = m / n * k;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
