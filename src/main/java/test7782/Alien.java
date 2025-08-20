package test7782;

import java.io.*;
import java.util.StringTokenizer;

public class Alien {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        boolean contains = false;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int lx = Integer.parseInt(st.nextToken());
            int ly = Integer.parseInt(st.nextToken());
            int hx = Integer.parseInt(st.nextToken());
            int hy = Integer.parseInt(st.nextToken());

            if (b1 >= lx && b2 >= ly && b1 <= hx && b2 <= hy) contains = true;
        }

        bw.write(contains ? "Yes" : "No");

        bw.flush();
        bw.close();
        br.close();
    }
}
