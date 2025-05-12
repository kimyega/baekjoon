package test2576;

import java.io.*;

public class Odd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int odd = 0, min = Integer.MAX_VALUE, cnt = 7;

        while (cnt-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 != 0) {
                odd += n;
                min = Math.min(min, n);
            }
        }

        String res = odd == 0 ? "-1" : odd + "\n" + min;
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
