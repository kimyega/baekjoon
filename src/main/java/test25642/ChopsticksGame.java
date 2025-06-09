package test25642;

import java.io.*;
import java.util.StringTokenizer;

public class ChopsticksGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int yt = Integer.parseInt(st.nextToken());
        int yj = Integer.parseInt(st.nextToken());

        int n = 0;

        while (yt < 5 && yj < 5) {
            n++;
            if (n % 2 == 1) yj += yt;
            else yt += yj;
        }

        bw.write(yt < yj ? "yt" : "yj");

        bw.flush();
        bw.close();
        br.close();
    }
}
