package test26594;

import java.io.*;

public class ZOAC5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        char pre = s.charAt(0);
        int cnt = 0;

        for (char c : s.toCharArray()) {
            if (c != pre) break;
            pre = c;
            cnt++;
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
