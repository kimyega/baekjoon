package test24265;

import java.io.*;

public class AlgorithmTimer4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());

        bw.write(n * (n - 1) / 2 + "\n" + 2);

        bw.flush();
        bw.close();
        br.close();
    }
}
