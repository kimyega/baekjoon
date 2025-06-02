package test23080;

import java.io.*;

public class ScytaleCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += k) {
            sb.append(s.charAt(i));
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
