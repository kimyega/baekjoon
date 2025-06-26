package test21212;

import java.io.*;
import java.util.StringTokenizer;

public class Cakes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int rq = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            min = Math.min(min, q / rq);
        }

        bw.write(min + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
