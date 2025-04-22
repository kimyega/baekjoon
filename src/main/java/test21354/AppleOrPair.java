package test21354;

import java.io.*;
import java.util.StringTokenizer;

public class AppleOrPair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String str = a * 7 < p * 13 ? "Petra" : a * 7 != p * 13 ? "Axel": "lika";
        bw.write(str);

        bw.flush();
        bw.close();
        br.close();
    }
}
