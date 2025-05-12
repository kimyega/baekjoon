package test2523;

import java.io.*;

public class Star13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st = "*";

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n * 2; i++) {
            if (i < n) {
                bw.write(st.repeat(i + 1));
            } else {
                bw.write(st.repeat(n * 2 - i - 1));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
