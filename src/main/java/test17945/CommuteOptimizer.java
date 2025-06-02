package test17945;

import java.io.*;
import java.util.StringTokenizer;

public class CommuteOptimizer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int d = a * a - b;
        int sqrt = (int) Math.sqrt(d);

        int x1 = -a - sqrt;
        int x2 = -a + sqrt;

        StringBuilder sb = new StringBuilder();

        sb.append(x1).append(x1 != x2 ? " " + x2 : "");

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
