package test20877;

import java.io.*;
import java.util.StringTokenizer;

public class Minigolf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int diff = 0;

        for (int i = 1; i <= n; i++) {
            int par = i % 2 == 0 ? 3 : 2;
            int shots = Integer.parseInt(st.nextToken());
            if (shots > 7) shots = 7;
            diff += shots - par;
        }

        bw.write(diff + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
