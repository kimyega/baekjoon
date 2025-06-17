package test32342;

import java.io.*;

public class WowQuery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(br.readLine());
        String pattern = "WOW";
        StringBuilder sb = new StringBuilder();

        while (q-- > 0) {
            int cnt = 0;
            String s = br.readLine();

            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i).startsWith(pattern)) cnt++;
            }

            sb.append(cnt + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
