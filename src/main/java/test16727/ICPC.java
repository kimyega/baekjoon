package test16727;

import java.io.*;
import java.util.StringTokenizer;

public class ICPC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int p1 = Integer.parseInt(st1.nextToken());
        int e1 = Integer.parseInt(st1.nextToken());
        int e2 = Integer.parseInt(st2.nextToken());
        int p2 = Integer.parseInt(st2.nextToken());
        int p = p1 + p2;
        int e = e1 + e2;

        String result = "";

        if(p > e || p == e && p2 > e1) {
            result = "Persepolis";
        } else if (p < e || p2 < e1) {
            result = "Esteghlal";
        } else {
            result = "Penalty";
        }

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}
