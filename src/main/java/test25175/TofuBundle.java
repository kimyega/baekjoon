package test25175;

import java.io.*;
import java.util.StringTokenizer;

public class TofuBundle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int d = k - 3;
        int next = ((m + d - 1) % n + n) % n + 1;

        bw.write(next + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
