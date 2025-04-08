package test17356;

import java.io.*;
import java.util.StringTokenizer;

public class UkClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        double uk = 1.0 / (Math.pow(10, (double) (b - a) / 400) + 1);
        bw.write(String.format("%.20f", uk));

        bw.flush();
        bw.close();
        br.close();
    }
}
