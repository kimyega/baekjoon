package test9664;

import java.io.*;

public class NASLJEDSTVO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int o = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = o + 1; i < (n + 1) * o; i++) {
            if (i - Math.floor(i / n) == o) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        bw.write(min + " " + max + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
