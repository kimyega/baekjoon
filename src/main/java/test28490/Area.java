package test28490;

import java.io.*;
import java.util.StringTokenizer;

public class Area {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;

        while (caseNo-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            int frame = w * h;
            max = Math.max(max, frame);
        }

        bw.write(max + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
