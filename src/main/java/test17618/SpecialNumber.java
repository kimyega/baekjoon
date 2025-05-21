package test17618;

import java.io.*;

public class SpecialNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            String nStr = i + "";

            for (char c : nStr.toCharArray()) {
                sum += c - '0';
            }

            if (i % sum == 0) cnt++;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
