package test30329;

import java.io.*;

public class Kick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int cnt = 0;

        for (int i = 0; i <= line.length() - 4; i++) {
            if (line.charAt(i) == 'k' &&
                    line.charAt(i + 1) == 'i' &&
                    line.charAt(i + 2) == 'c' &&
                    line.charAt(i + 3) == 'k') {
                cnt++;
            }
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
