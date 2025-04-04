package test14652;

import java.io.*;
import java.util.StringTokenizer;

public class Hanwa {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = k / m;
        int y = k % m;
        bw.write(x + " " + y);
        br.close();
        bw.flush();
        bw.close();
    }
}
