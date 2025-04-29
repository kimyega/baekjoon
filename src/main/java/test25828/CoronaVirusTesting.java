package test25828;

import java.io.*;
import java.util.StringTokenizer;

public class CoronaVirusTesting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int g = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int pkitCount = g * p;
        int gkitCount = g + t * p;
        String s = gkitCount == pkitCount ? "0" : pkitCount < gkitCount ? "1" : "2";
        bw.write(s);

        bw.flush();
        bw.close();
        br.close();
    }
}
