package test21603;

import java.io.*;
import java.util.StringTokenizer;

public class K2KGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (isK2k(i)) {
                cnt++;
                sb.append(i + " ");
            }
        }

        bw.write(cnt + "\n" + sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static int k;

    static boolean isK2k (int n) {
        return n % 10 != k % 10 && n % 10 != 2 * k % 10;
    }
}
