package test28960;

import java.io.*;
import java.util.StringTokenizer;

public class LevitationCloak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean canHang = (a <= l && b <= 2 * h) || (b <= l && a <= 2 * h);
        String res = canHang ? "YES" : "NO";
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
