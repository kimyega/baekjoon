package test24296;

import java.io.*;

public class Line {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(minLine(n) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    static int minLine(int n) {
        return n % 2 == 0 ? n : minLine(n / 2 + 1);
    }
}
