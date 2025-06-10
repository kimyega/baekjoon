package test13236;

import java.io.*;

public class CollatzConjecture {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(collatzSeq(n));

        bw.flush();
        bw.close();
        br.close();
    }

    static String collatzSeq(int n) {
        if (n == 1) return "1";
        return n + " " + collatzSeq(n % 2 == 0 ? n / 2 : 3 * n + 1);
    }
}
