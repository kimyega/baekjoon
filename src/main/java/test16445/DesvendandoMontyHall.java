package test16445;

import java.io.*;

public class DesvendandoMontyHall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (n-- > 0) {
            int door = Integer.parseInt(br.readLine());
            if (door != 1) cnt++;
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
