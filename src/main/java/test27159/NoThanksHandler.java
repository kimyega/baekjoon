package test27159;

import java.io.*;
import java.util.StringTokenizer;

public class NoThanksHandler {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int pre = Integer.parseInt(st.nextToken());
        int sum = pre;

        while (st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());

            if (++pre != x) {
                sum += x;
                pre = x;
            }
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
