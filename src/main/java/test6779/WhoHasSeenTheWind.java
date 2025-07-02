package test6779;

import java.io.*;

public class WhoHasSeenTheWind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean isGround = false;
        int t = 0;

        for (int i = 1; i <= m; i++) {
            int a = -6 * (int) Math.pow(i, 4) + h * (int) Math.pow(i, 3) + 2 * i * i + i;
            if (a <= 0) {
                t = i;
                isGround = true;
                break;
            }
        }

        bw.write(isGround ? "The balloon first touches ground at hour: " + t : "The balloon does not touch ground in the given time.");

        bw.flush();
        bw.close();
        br.close();
    }
}
