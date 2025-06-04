package test18005;

import java.io.*;

public class EvenOrOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(n % 4 == 0 ? "2" : n % 4 == 2 ? "1" : "0");

        bw.flush();
        bw.close();
        br.close();
    }
}
