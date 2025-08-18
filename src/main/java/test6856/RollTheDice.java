package test6856;

import java.io.*;

public class RollTheDice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 10, cnt = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i + j == sum) cnt++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("There ").append(cnt == 1 ? "is " : "are ").append(cnt).append(cnt == 1 ? " way " : " ways ").append("to get the sum " + sum + ".\n");
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
