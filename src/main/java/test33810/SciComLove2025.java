package test33810;

import java.io.*;

public class SciComLove2025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String scl = "SciComLove";
        int wrong = 0;

        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            char sclCh = scl.charAt(i);
            char ch = word.charAt(i);

            if (sclCh != ch) {
                wrong++;
            }
        }

        bw.write(wrong + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
