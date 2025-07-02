package test25841;

import java.io.*;
import java.util.StringTokenizer;

public class DigitCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for (int i = start; i <= end; i++) {
            String str = String.valueOf(i);

            for (char c : str.toCharArray()) {
                if (c - '0' == n) cnt++;
            }
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
