package test2935;

import java.io.*;
import java.math.BigInteger;

public class Noise {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger a = new BigInteger(br.readLine());
        String s = br.readLine();
        BigInteger b = new BigInteger(br.readLine());

        BigInteger res = s.equals("+") ? a.add(b) : a.multiply(b);
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
