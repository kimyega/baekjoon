package test2914;

import java.io.*;
import java.util.StringTokenizer;

public class Copyright {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int avg = Integer.parseInt(st.nextToken());

        int res = a * (avg - 1) + 1;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
