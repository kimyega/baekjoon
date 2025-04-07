package test25191;

import java.io.*;
import java.util.StringTokenizer;

public class ChickenDance {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int chickNo = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int coke = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());

        int ch = coke / 2 + beer;
        int res = Math.min(ch, chickNo);

        bw.write(res + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
