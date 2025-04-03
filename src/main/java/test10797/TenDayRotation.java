package test10797;

import java.io.*;
import java.util.StringTokenizer;

public class TenDayRotation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int day = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (day % 10 == num) {
                count++;
            }
        }
        bw.write(count + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
