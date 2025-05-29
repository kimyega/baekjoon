package test16479;

import java.io.*;
import java.util.StringTokenizer;

public class CupRamenScheduler {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int d1 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        double abs = Math.abs(d1 - d2) / 2.0;
        double hsq = k * k - abs * abs;

        bw.write(hsq + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
