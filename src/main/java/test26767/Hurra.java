package test26767;

import java.io.*;

public class Hurra {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            if (i % 7 == 0 && i % 11 == 0) {
                sb.append("Wiwat!");
            } else if (i % 7 == 0) {
                sb.append("Hurra!");
            } else if (i % 11 == 0) {
                sb.append("Super!");
            } else {
                sb.append(i);
            }

            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
