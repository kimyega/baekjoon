package test13579;

import java.io.*;
import java.util.StringTokenizer;

public class Tridu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int res = Math.max(a, b);
        if (a == b) {
            res = a;
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
