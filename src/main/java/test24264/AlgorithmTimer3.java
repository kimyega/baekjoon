package test24264;

import java.io.*;

public class AlgorithmTimer3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        bw.write(n * n + "\n" + 2);

        bw.flush();
        bw.close();
        br.close();
    }
}
