package test15780;

import java.io.*;
import java.util.StringTokenizer;

public class MultiTapCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int sum = 0;

        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            sum += a % 2 == 0 ? a / 2 : a / 2 + 1;
        }

        bw.write(n <= sum ? "YES" : "NO");

        bw.flush();
        bw.close();
        br.close();
    }
}
