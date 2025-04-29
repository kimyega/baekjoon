package test32278;

import java.io.*;

public class Optional {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long sh = (long) Math.pow(2, 15), shMin = sh * -1, shMax = sh - 1;
        long in = (long) Math.pow(2, 31), inMin = in * -1, inMax = in - 1;

        long n = Long.parseLong(br.readLine());

        String dt = n > inMax || n < inMin ? "long long" : n > shMax || n < shMin ? "int" : "short";
        bw.write(dt);

        bw.flush();
        bw.close();
        br.close();
    }
}
