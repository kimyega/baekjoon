package test5724;

import java.io.*;

public class Feynman {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int res = n * (n + 1) * (2 * n + 1) / 6;
            sb.append(res).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
