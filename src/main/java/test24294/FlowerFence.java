package test24294;

import java.io.*;

public class FlowerFence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int w1 = Integer.parseInt(br.readLine());
        int h1 = Integer.parseInt(br.readLine());
        int w2 = Integer.parseInt(br.readLine());
        int h2 = Integer.parseInt(br.readLine());

        int res = 4 + Math.max(w1, w2) * 2 + (h1 + h2) * 2;

        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
