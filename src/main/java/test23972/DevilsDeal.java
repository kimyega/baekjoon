package test23972;

import java.io.*;
import java.util.StringTokenizer;

public class DevilsDeal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long k = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        long res = n == 1 ? -1 : n * k % (n - 1) == 0 ? n * k / (n - 1) : n * k / (n - 1) + 1;
        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
