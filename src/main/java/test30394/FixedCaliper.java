package test30394;

import java.io.*;
import java.util.StringTokenizer;

public class FixedCaliper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            min = Math.min(min, y);
            max = Math.max(max, y);
        }

        bw.write(max - min + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
