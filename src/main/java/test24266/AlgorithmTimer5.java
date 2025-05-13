package test24266;

import java.io.*;

public class AlgorithmTimer5 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        bw.write(n * n * n + "\n" + 3);

        bw.flush();
        bw.close();
        br.close();
    }
}
