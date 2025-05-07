package test28940;

import java.io.*;
import java.util.StringTokenizer;

public class GravityDiary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sq = w / a == 0 || h / b == 0 ? -1 : (w / a) * (h / b);
        int res = sq == -1 ? -1 : n % sq == 0 ? n / sq : n / sq + 1;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
