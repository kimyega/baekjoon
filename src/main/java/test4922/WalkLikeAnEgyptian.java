package test4922;

import java.io.*;

public class WalkLikeAnEgyptian {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int res = 0;
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            res = 1 + n * (n - 1);

            sb.append(n + " => " + res).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
