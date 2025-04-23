package test21631;

import java.io.*;
import java.util.StringTokenizer;

public class Checkers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long res = Math.min(b, a + 1);
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
