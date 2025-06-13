package test31798;

import java.io.*;
import java.util.StringTokenizer;

public class ChapterTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int res = 0;

        if (a == 0) {
            res = c * c - b;
        } else if (b == 0) {
            res = c * c - a;
        } else if (c == 0) {
            res = (int) Math.sqrt(a + b);
        }

        bw.write(String.valueOf(res));

        bw.flush();
        bw.close();
        br.close();
    }
}
