package test28635;

import java.io.*;

public class CircularIndicator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int res = a <= b ? b - a : m - a + b;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
