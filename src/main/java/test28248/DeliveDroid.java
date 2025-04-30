package test28248;

import java.io.*;

public class DeliveDroid {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int p = Integer.parseInt(br.readLine());
       int c = Integer.parseInt(br.readLine());

        int score = p * 50 - c * 10;

        if (p > c) {
            score += 500;
        }

        bw.write(score + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
