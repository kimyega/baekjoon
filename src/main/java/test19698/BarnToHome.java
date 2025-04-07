package test19698;

import java.io.*;
import java.util.StringTokenizer;

public class BarnToHome {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int cow = (w / l) * (h / l);
        int res = Math.min(cow, n);
        bw.write(res + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
