package test8371;

import java.io.*;

public class Dyslexia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;

        int n = Integer.parseInt(br.readLine());
        String original = br.readLine();
        String rewritten = br.readLine();

        for (int i = 0; i < n; i++) {
            if (original.charAt(i) != rewritten.charAt(i)) cnt++;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
