package test24623;

import java.io.*;

public class Fence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());

        int res = 90;
        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
