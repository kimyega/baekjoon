package test17869;

import java.io.*;

public class SimpleCollatzSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        bw.write(collatz(n) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    static long collatz(long n) {
        return n == 1 ? 0 : 1 + collatz(n % 2 == 0 ? n / 2 : n + 1);
    }
}
