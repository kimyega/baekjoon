package test32288;

import java.io.*;

public class BarcodeNickname {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            boolean isUpper = Character.isUpperCase(c);

            if (isUpper) {
                sb.append((c + "").toLowerCase());
            } else {
                sb.append((c + "").toUpperCase());
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
